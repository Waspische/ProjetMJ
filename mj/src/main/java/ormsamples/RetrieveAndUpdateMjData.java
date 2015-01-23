/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMjData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession().beginTransaction();
		try {
			com.rizomm.carpooling.model.DAOFactory lDAOFactory = com.rizomm.carpooling.model.DAOFactory.getDAOFactory();
			com.rizomm.carpooling.model.dao.MembreDAO lcomrizommcarpoolingmodelMembreDAO = lDAOFactory.getMembreDAO();
			com.rizomm.carpooling.model.Membre lcomrizommcarpoolingmodelMembre = lcomrizommcarpoolingmodelMembreDAO.loadMembreByQuery(null, null);
			// Update the properties of the persistent object
			lcomrizommcarpoolingmodelMembreDAO.save(lcomrizommcarpoolingmodelMembre);
			com.rizomm.carpooling.model.dao.ReservationDAO lcomrizommcarpoolingmodelReservationDAO = lDAOFactory.getReservationDAO();
			com.rizomm.carpooling.model.Reservation lcomrizommcarpoolingmodelReservation = lcomrizommcarpoolingmodelReservationDAO.loadReservationByQuery(null, null);
			// Update the properties of the persistent object
			lcomrizommcarpoolingmodelReservationDAO.save(lcomrizommcarpoolingmodelReservation);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMjData retrieveAndUpdateMjData = new RetrieveAndUpdateMjData();
			try {
				retrieveAndUpdateMjData.retrieveAndUpdateTestData();
			}
			finally {
				com.rizomm.carpooling.model.MjPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
