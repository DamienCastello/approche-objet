package fichier;

import java.util.Objects;

public class Ville {
    private String nom;
    private String codeDepartement;
    private String NomRegion;
    private int populationTotale;

    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        NomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    public String getNom() {
        return nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getNomRegion() {
        return NomRegion;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return populationTotale == ville.populationTotale && Objects.equals(nom, ville.nom) && Objects.equals(codeDepartement, ville.codeDepartement) && Objects.equals(NomRegion, ville.NomRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, codeDepartement, NomRegion, populationTotale);
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", NomRegion='" + NomRegion + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }
}
