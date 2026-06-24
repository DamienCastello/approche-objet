package entites2;

import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(5,"rue de la totostory","13200","Totocity");
        AdressePostale adresse2 = new AdressePostale(10,"rue des devs","13200","Yolotown");

        Personne personne1 = new Personne("Castello", "Damien", adresse1);
        Personne personne2 = new Personne("Mozinor", "Président", adresse2);
    }
}
