package fr.diginamic.combat;

public class PotionDeVie extends Potion{
    private final String nom;
    private final int montant;

    public PotionDeVie() {
        this.nom = "Potion de vie";
        this.montant = Utils.randomiser(5, 10);
    }

    public int getMontant() {
        return montant;
    }

    @Override
    public String getNom() {
        return nom;
    }
}
