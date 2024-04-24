package model;

public class ReservationRestaurant extends Reservation {
    private int numService;

    public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
        super(jour, mois, numTable);
        this.numService = numService;
    }

    public int getNumService() {
        return numService;
    }

    public int getNumTable() {
        return getEntityID();
    }

    @Override
    public String toString() {
        return String.format("Le %d/%d\nTable %d pour le %s service.", getJour(), getMois(), getNumTable(), numService == 1 ? "premier" : "deuxième");
    }
}
