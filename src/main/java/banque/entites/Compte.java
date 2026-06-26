package banque.entites;

public class Compte {
    private final String numeroCompte;
    private int solde;

    public Compte(String numeroCompte, int solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public String getNumeroCompte(){
        return this.numeroCompte;
    }

    public int getSolde(){
        return this.solde;
    }

    public void setSolde(int solde){
        this.solde = solde;
    }

    public String toString(){
        return "numéro de compte: " + this.numeroCompte + "\n" + "solde: " + this.solde + "\n";
    }
}
