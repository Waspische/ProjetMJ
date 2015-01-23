/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteMjData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession().beginTransaction();
		try {
			com.rizomm.carpooling.model.DAOFactory lDAOFactory = com.rizomm.carpooling.model.DAOFactory.getDAOFactory();
			com.rizomm.carpooling.model.dao.MembreDAO lcomrizommcarpoolingmodelMembreDAO = lDAOFactory.getMembreDAO();
			com.rizomm.carpooling.model.Membre lcomrizommcarpoolingmodelMembre = lcomrizommcarpoolingmodelMembreDAO.loadMembreByQuery(null, null);
			// Delete the persistent object
			lcomrizommcarpoolingmodelMembreDAO.delete(lcomrizommcarpoolingmodelMembre);
			com.rizomm.carpooling.model.dao.ReservationDAO lcomrizommcarpoolingmodelReservationDAO = lDAOFactory.getReservationDAO();
			com.rizomm.carpooling.model.Reservation lcomrizommcarpoolingmodelReservation = lcomrizommcarpoolingmodelReservationDAO.loadReservationByQuery(null, null);
			// Delete the persistent object
			lcomrizommcarpoolingmodelReservationDAO.delete(lcomrizommcarpoolingmodelReservation);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMjData deleteMjData = new DeleteMjData();
			try {
				deleteMjData.deleteTestData();
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
