package model;

class CalendrierAnnuel {
    private Mois[] moisList;

    public CalendrierAnnuel() {
        Mois[] moisList = new Mois[] {
            new Mois("Janvier", 31),
            new Mois("Février", 28),
            new Mois("Mars", 31),
            new Mois("Avril", 30),
            new Mois("Mai", 31),
            new Mois("Juin", 30),
            new Mois("Juillet", 31),
            new Mois("Août", 31),
            new Mois("Septembre", 30),
            new Mois("Octobre", 31),
            new Mois("Novembre", 30),
            new Mois("Décembre", 31)
        };

        this.moisList = moisList;
    }

    public boolean estLibre(int jour, int mois) {
        if(!(1 <= mois && mois <= 12)) {
            throw new IllegalArgumentException("Mois invalide");
        }
        
        try {
        	return moisList[mois-1].estLibre(jour-1);
        } catch(IllegalArgumentException e) {
            return false;
        }
    }

    public boolean reserver(int jour, int mois) {
        if(!(1 <= mois && mois <= 12)) {
        	throw new IllegalArgumentException("Mois invalide");
        }

        try {
            moisList[mois-1].reserver(jour-1);
            return true;
        } catch(IllegalStateException e) {
            return false;
        } catch(IllegalArgumentException e) {
            return false;
        }
    }

    private class Mois {
        private String nom;
        private boolean[] jours;

        private Mois(String nom, int nbJours) {
            this.nom = nom;
            jours = new boolean[nbJours];
            for(int i = 0; i < jours.length; i++) {
                jours[i] = true;
            }
        }

        public boolean estLibre(int jour) {
            return jours[jour];
        }

        public void reserver(int jour) {
            if(!(1 <= jour && jour <= jours.length)) {
                throw new IllegalArgumentException("Jour invalide");
            }
            if(!jours[jour]) {
                throw new IllegalStateException("Jour déjà réservé");
            }
            jours[jour] = false;
        }
    }
}