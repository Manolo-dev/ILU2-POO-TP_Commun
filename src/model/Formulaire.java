package model;

public class Formulaire {
	private int jour;
	private int mois;
	private int entityID;
	
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

    protected void setEntityID(int entityID) {
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
