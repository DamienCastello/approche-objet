package liste;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int nbHabitant;

    public Ville(String nom, int nbHabitant) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(int nbHabitant) {
        this.nbHabitant = nbHabitant;
    }

    @Override
    public String toString() {
        return "Ville: " + getNom() + " Habitants: " + getNbHabitant();
    }

    @Override
    public int compareTo(Ville ville) {
        if(this.nbHabitant > ville.getNbHabitant()){
            return 1;
        } else if(this.nbHabitant < ville.getNbHabitant()){
            return -1;
        }
        return this.nom.compareTo(ville.getNom());
    }
}
