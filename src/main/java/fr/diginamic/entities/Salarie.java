package fr.diginamic.entities;

public class Salarie {
    private final String nom;
    private final String prenom;
    private final double salaire;

    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Le salaire de " + this.nom + " " + this.prenom + " est de " + this.salaire + "€.";
    }
}
