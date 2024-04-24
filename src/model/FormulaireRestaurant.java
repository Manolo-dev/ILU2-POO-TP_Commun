package model;

public class FormulaireRestaurant extends Formulaire {
    private int numService;
    private int nbPersonnes;

    public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
        super(jour, mois);
        this.numService = numService;
        this.nbPersonnes = nbPersonnes;
        setEntityID(0);
    }

    public int getNumService() {
        return numService;
    }

    public int getIdentificationEntite() {
        return getEntityID();
    }

    public int getNombrePersonnes() {
        return nbPersonnes;
    }

    public void setIdentificationEntite(int identificationEntite) {
        setEntityID(identificationEntite);
    }
}