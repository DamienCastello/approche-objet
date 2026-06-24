package entites2;

import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 5;
        adresse1.libelleRue = "rue de la totostory";
        adresse1.codePostal = "13200";
        adresse1.ville = "Totocity";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 10;
        adresse2.libelleRue = "rue des devs";
        adresse2.codePostal = "13200";
        adresse2.ville = "Yolotown";

        Personne personne1 = new Personne();
        personne1.nom = "Castello";
        personne1.prenom = "Damien";
        personne1.adresse = adresse1;

        Personne personne2 = new Personne();
        personne2.nom = "Mozinor";
        personne2.prenom = "Président";
        personne2.adresse = adresse2;
    }
}
