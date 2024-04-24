package model;

public class Reservation {
	private int jour;
	private int mois;
	private int entityID;
	
	protected Reservation(int jour, int mois, int entityID) {
		this.jour = jour;
		this.mois = mois;
		this.entityID = entityID;
	}
	
	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getEntityID() {
		return entityID;
	}
}
