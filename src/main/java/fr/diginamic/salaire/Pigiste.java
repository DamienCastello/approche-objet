package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    private int joursTravaillesCeMois;
    private final int montantJournalierRemuneration;

    public Pigiste(String nom, String prenom, int joursTravaillesCeMois, int montantJournalierRemuneration) {
        super(nom, prenom);
        this.joursTravaillesCeMois = joursTravaillesCeMois;
        this.montantJournalierRemuneration = montantJournalierRemuneration;
    }

    public int getJoursTravaillesCeMois(){
        return joursTravaillesCeMois;
    }

    public void setJoursTravaillesCeMois(int joursTravaillesCeMois){
        this.joursTravaillesCeMois = joursTravaillesCeMois;
    }

    public int getMontantJournalierRemuneration(){
        return montantJournalierRemuneration;
    }

    @Override
    public int getSalaire(){
        return this.joursTravaillesCeMois * this.montantJournalierRemuneration;
    }

    public String getStatus() {
        String nomClasseFille = Thread.currentThread().getStackTrace()[1].getClassName();
        String[] split = nomClasseFille.split("\\.");

        return split[split.length - 1];
    }
}
