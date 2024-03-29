package com.rizomm.carpooling.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rizomm.carpooling.dao.TrajetDAO;
import com.rizomm.carpooling.form.ReservationForm;
import com.rizomm.carpooling.model.Trajet;
import com.rizomm.carpooling.model.Utilisateur;
import com.rizomm.carpooling.service.PassagerService;
import com.rizomm.carpooling.service.VilleService;

@Repository("trajetDAO")
public class TrajetDAOImpl implements TrajetDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private VilleService villeService;
	
	@Autowired
	private PassagerService passagerService;
	
	public TrajetDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public TrajetDAOImpl() {
	}

	@Override
	public Trajet save(Trajet trajet) {
		sessionFactory.getCurrentSession().save(trajet);
		return trajet; 
	}

	@Override
	public int getMaxId() {
		Criteria criteria = sessionFactory.getCurrentSession()
			    .createCriteria(Trajet.class)
			    .setProjection(Projections.max("id"));
		if(criteria.uniqueResult()!=null)
			return (Integer)criteria.uniqueResult();
		else
			return 0;
	}

	@Override
	public List<Trajet> getTousLesTrajets() {
		List<Trajet> list = new ArrayList<Trajet>();
		for(Object t : sessionFactory.getCurrentSession().createCriteria(Trajet.class).list())
		{
			list.add((Trajet)t);
		}
		return list;
	}

	@Override
	public List<Trajet> getTrajetsAvecParametres(ReservationForm reservationForm) {
		List<Trajet> list = new ArrayList<Trajet>();
		String query = "select t from Trajet t where 1=1";
		if(reservationForm.getRechercheForm().getPointDepart()!="")
			query = query + " and t.idVilleDepart="+villeService.getVilleByLibelle(reservationForm.getRechercheForm().getPointDepart()).getId();
		if(reservationForm.getRechercheForm().getPointArrivee()!="")
			query = query + " and t.idVilleArrivee="+villeService.getVilleByLibelle(reservationForm.getRechercheForm().getPointArrivee()).getId();
		if(reservationForm.getRechercheForm().getDateDepart()!="")
		{
			try {
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date startDate = formatter.parse(reservationForm.getRechercheForm().getDateDepart());
				String startDateStr = formatter2.format(startDate);
				Calendar c = Calendar.getInstance(); 
				c.setTime(startDate); 
				c.add(Calendar.DATE, 1);
				Date endDate = c.getTime();
				String endDateStr = formatter2.format(endDate);
				query = query + " and t.dateCreation between '"+startDateStr+"' and '"+endDateStr+"'";
			} catch (ParseException e) {
				System.out.println("---------------------------- Erreur dans la date");
			}
		}
		
		for(Trajet t : (List<Trajet>)sessionFactory.getCurrentSession().createQuery(query).list())
		{
			if(reservationForm.getRechercheForm().getPlacesDispo())
			{
				if(passagerService.getPassagerByTrajet(t).size()<t.getNbPassager())
					list.add(t);
			}
			else
			{
				list.add(t);
			}
			
		}
		return list;
	}

	@Override
	public Trajet getTrajetById(int id) {
		Query query = sessionFactory.getCurrentSession().getNamedQuery("TrajetById");
		query.setInteger("id", id);
		if(query.list().size()>0)
			return (Trajet) query.list().get(0);
		else
			return null;
	}
}
