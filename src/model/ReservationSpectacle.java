package model;

public class ReservationSpectacle extends Reservation {
    private int numZone;

    public ReservationSpectacle(int jour, int mois, int numZone, int numChair) {
        super(jour, mois, numChair);
        this.numZone = numZone;
    }

    public int getNumZone() {
        return numZone;
    }

    public int getNumChair() {
        return getEntityID();
    }

    @Override
    public String toString() {
        return String.format("Le %d/%d\nZone %d, Chaise n°%d.", getJour(), getMois(), numZone, getNumChair());
    }
}
