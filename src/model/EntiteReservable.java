package model;

public abstract class EntiteReservable<Form extends Formulaire> {
    private CalendrierAnnuel calendrier;
    private int entityID;

    public EntiteReservable() {
        calendrier = new CalendrierAnnuel();
        entityID = 0;
    }

    public int getIdentificationEntite() {
        return entityID;
    }
    
    public void setIdentificationEntite(int identificationEntite) {
        entityID = identificationEntite;
    }

    public boolean estLibre(Form formulaire) {
        return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
    }

    public abstract boolean compatible(Form formulaire);

    public abstract Reservation reserver(Form formulaire);
}
