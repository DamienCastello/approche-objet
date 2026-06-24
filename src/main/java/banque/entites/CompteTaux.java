package banque.entites;

public class CompteTaux extends Compte {
    double tauxRemuneration;
    CompteTaux(String numeroCompte, int solde, double tauxRemuneration) {
        super(numeroCompte, solde);
        this.tauxRemuneration = tauxRemuneration;

    }

    public String toString() {
        return super.toString() + "Taux de rémunération: " + this.tauxRemuneration + "\n";
    }
}
