package entites;

public class AdressePostale {
    public AdressePostale(int numeroRue, String libelleRue, String codePostal, String ville){
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
    public int numeroRue;
    public String libelleRue;
    public String codePostal;
    public String ville;
}
