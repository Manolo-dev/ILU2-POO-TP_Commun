package model;

public class ReservationHotel extends Reservation {
    private int nbBed;
    private int nbDoubleBed;

    public ReservationHotel(int jour, int mois, int nbBed, int nbDoubleBed, int numRoom) {
        super(jour, mois, numRoom);
        this.nbBed = nbBed;
        this.nbDoubleBed = nbDoubleBed;
    }

    public int getNbBed() {
        return nbBed;
    }

    public int getNbDoubleBed() {
        return nbDoubleBed;
    }

    public int getNumRoom() {
        return getEntityID();
    }

    @Override
    public String toString() {
        return String.format("Le %d/%d\nChambre n°%d : %d lit(s) simple(s) et %d lit(s) double(s).", getJour(), getMois(), getNumRoom(), nbBed, nbDoubleBed);
    }
}
