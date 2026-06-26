package fr.diginamic.salaire;

public class Salarie extends Intervenant{
    private int montantSalaire;

    public Salarie(String nom, String prenom, int montantSalaire) {
        super(nom, prenom);
        this.montantSalaire = montantSalaire;
    }

    public int getMontantSalaire() {
        return montantSalaire;
    }

    public void setMontantSalaire(int montantSalaire) {
        this.montantSalaire = montantSalaire;
    }

    public String getStatus() {
        String nomClasseFille = Thread.currentThread().getStackTrace()[1].getClassName();
        String[] split = nomClasseFille.split("\\.");

        return split[split.length - 1];
    }


    @Override
    public int getSalaire(){
        return this.montantSalaire;
    }

    @Override
    public String toString() {
        return afficherDonnees();
    }
}
