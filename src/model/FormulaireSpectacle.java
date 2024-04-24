package model;

public class FormulaireSpectacle extends Formulaire {
    private int numZone;

    public FormulaireSpectacle(int jour, int mois, int numZone) {
        super(jour, mois);
        this.numZone = numZone;
        setEntityID(0);
    }

    public int getNumZone() {
        return numZone;
    }

    public int getIdentificationEntite() {
        return getEntityID();
    }

    public void setIdentificationEntite(int identificationEntite) {
        setEntityID(identificationEntite);
    }
}
