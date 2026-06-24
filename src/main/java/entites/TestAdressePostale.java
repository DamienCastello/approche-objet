package entites;

public class TestAdressePostale {

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
    }
}
