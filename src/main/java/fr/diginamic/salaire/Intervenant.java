package fr.diginamic.salaire;

abstract class Intervenant {
    private String nom;
    private String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return afficherDonnees();
    }

    abstract String getStatus();

    public String afficherDonnees() {
        return this.prenom + " " + this.nom + "(" + getStatus() + ")" + " sera payé: " + getSalaire();
    }

    abstract int getSalaire();
}
