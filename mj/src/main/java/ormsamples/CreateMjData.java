/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;

public class CreateMjData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = com.rizomm.carpooling.model.MjPersistentManager
				.instance().getSession().beginTransaction();
		try {
			// com.rizomm.carpooling.model.DAOFactory lDAOFactory =
			// com.rizomm.carpooling.model.DAOFactory.getDAOFactory();
			// com.rizomm.carpooling.model.dao.MembreDAO
			// lcomrizommcarpoolingmodelMembreDAO = lDAOFactory.getMembreDAO();
			// com.rizomm.carpooling.model.Membre
			// lcomrizommcarpoolingmodelMembre =
			// lcomrizommcarpoolingmodelMembreDAO.createMembre();
			// // TODO Initialize the properties of the persistent object here,
			// the following properties must be initialized before saving :
			// reservations
			// lcomrizommcarpoolingmodelMembreDAO.save(lcomrizommcarpoolingmodelMembre);
			// com.rizomm.carpooling.model.dao.ReservationDAO
			// lcomrizommcarpoolingmodelReservationDAO =
			// lDAOFactory.getReservationDAO();
			// com.rizomm.carpooling.model.Reservation
			// lcomrizommcarpoolingmodelReservation =
			// lcomrizommcarpoolingmodelReservationDAO.createReservation();
			// // Initialize the properties of the persistent object here
			// lcomrizommcarpoolingmodelReservationDAO.save(lcomrizommcarpoolingmodelReservation);
			// t.commit();

			com.rizomm.carpooling.model.Membre lcomrizommcarpoolingmodelMembre = new com.rizomm.carpooling.model.Membre(); // Initialize
																														// here
			lcomrizommcarpoolingmodelMembre.setNomMembre("DUPUIS");
			lcomrizommcarpoolingmodelMembre.setPrenomMembre("MARC");
			com.rizomm.carpooling.model.Reservation lcomrizommcarpoolingmodelReservation = new com.rizomm.carpooling.model.Reservation(); // Initialize
																																		// here
			lcomrizommcarpoolingmodelReservation
					.setDateReservation("2015-01-01");
			java.util.Set reservations = new java.util.HashSet();
			reservations.add(lcomrizommcarpoolingmodelReservation);
			lcomrizommcarpoolingmodelMembre.setReservations(reservations);
			com.rizomm.carpooling.model.MjPersistentManager.instance()
					.getSession().save(lcomrizommcarpoolingmodelMembre);
			// com.rizomm.carpooling.model.CarpoolingPersistentManager.instance().getSession().save(lcomrizommcarpoolingmodelReservation);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}

	public static void main(String[] args) {
		try {
			CreateMjData createMjData = new CreateMjData();
			try {
				createMjData.createTestData();
			} finally {
				com.rizomm.carpooling.model.MjPersistentManager.instance()
						.disposePersistentManager();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
