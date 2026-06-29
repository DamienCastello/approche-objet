package testequals;

import java.util.Objects;

public class Pays {
    private String nom;
    private int pop;

    public Pays(String nom, int pop) {
        this.nom = nom;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "nom=" + nom + ", pop=" + pop ;
    }

    @Override
    public boolean equals(Object obj){

        // teste aussi le cas où obj est null
        if (!(obj instanceof Pays autre)){
            return false;
        }
        return Objects.equals(this.getNom(), autre.getNom()) && this.pop == autre.getPop();
    }

    /**
     * Getter for nom
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter for nom
     *
     * @param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for pop
     *
     * @return pop
     */
    public int getPop() {
        return pop;
    }

    /**
     * Setter for pop
     *
     * @param pop pop
     */
    public void setPop(int pop) {
        this.pop = pop;
    }
}