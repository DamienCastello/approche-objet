package entites2;

import entites.AdressePostale;

public class Personne {
    Personne(String nom, String prenom, AdressePostale adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public String nom;
    public String prenom;
    public AdressePostale adresse;
}
