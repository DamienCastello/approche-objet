package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    Personne(String nom, String prenom, AdressePostale adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    void Afficher(){
        System.out.println(this.nom.toUpperCase() + " " + this.prenom.toUpperCase());
    }

    void ModifierPrenom(String prenom){
        this.prenom = prenom;
    }

    void ModifierAdresse(AdressePostale adresse){
        this.adresse.numeroRue = adresse.numeroRue;
        this.adresse.libelleRue = adresse.libelleRue;
        this.adresse.codePostal = adresse.codePostal;
        this.adresse.ville = adresse.ville;
    }

    String RetournerNom(){
        return this.nom;
    }

    String RetournerPrenom(){
        return this.prenom;
    }

    AdressePostale RetournerAdresse(){
        return this.adresse;
    }
}
