package banque.entites;

public class Compte {
    String numeroCompte;
    int solde;

    Compte(String numeroCompte, int solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public String toString(){
        return "numéro de compte: " + this.numeroCompte + "\n" + "solde: " + this.solde;
    }
}
