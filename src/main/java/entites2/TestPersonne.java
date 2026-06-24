package entites2;

import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(5,"rue de la totostory","13200","Totocity");
        AdressePostale adresse2 = new AdressePostale(10,"rue des devs","13200","Yolotown");

        Personne personne1 = new Personne("castello", "damien", adresse1);
        Personne personne2 = new Personne("mozinor", "président", adresse2);


        AdressePostale adresse3 = new AdressePostale(15,"rue de la république","13200","Arles");
        personne2.ModifierAdresse(adresse3);
    }
}
