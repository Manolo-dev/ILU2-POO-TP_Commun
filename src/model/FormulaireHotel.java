package model;

public class FormulaireHotel extends Formulaire {
    private int nbBed;
    private int nbDoubleBed;

    public FormulaireHotel(int jour, int mois, int nbBed, int nbDoubleBed) {
        super(jour, mois);
        this.nbBed = nbBed;
        this.nbDoubleBed = nbDoubleBed;
        setEntityID(0);
    }

    public int getNbBed() {
        return nbBed;
    }

    public int getNbDoubleBed() {
        return nbDoubleBed;
    }

    public int getIdentificationEntite() {
        return getEntityID();
    }

    public void setIdentificationEntite(int identificationEntite) {
        setEntityID(identificationEntite);
    }
}
