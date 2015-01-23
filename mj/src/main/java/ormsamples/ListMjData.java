/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListMjData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		com.rizomm.carpooling.model.DAOFactory lDAOFactory = com.rizomm.carpooling.model.DAOFactory.getDAOFactory();
		System.out.println("Listing Membre...");
		com.rizomm.carpooling.model.Membre[] comrizommcarpoolingmodelMembres = lDAOFactory.getMembreDAO().listMembreByQuery(null, null);
		int length = Math.min(comrizommcarpoolingmodelMembres.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comrizommcarpoolingmodelMembres[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Reservation...");
		com.rizomm.carpooling.model.Reservation[] comrizommcarpoolingmodelReservations = lDAOFactory.getReservationDAO().listReservationByQuery(null, null);
		length = Math.min(comrizommcarpoolingmodelReservations.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comrizommcarpoolingmodelReservations[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListMjData listMjData = new ListMjData();
			try {
				listMjData.listTestData();
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
