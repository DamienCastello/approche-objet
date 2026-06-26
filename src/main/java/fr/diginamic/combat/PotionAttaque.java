package fr.diginamic.combat;

public class PotionAttaque extends Potion {
    private final String nom;
    private final String type;
    private final int montant;
    private int durabilite;

    public PotionAttaque(String type) {
        this.nom = "Potion d'attaque " + type;
        this.type = type;
        this.montant = type.equals("inférieure") ? 3 : 5;
        this.durabilite = type.equals("inférieure") ? 1 : 2;
    }

    @Override
    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public int getMontant() {
        return montant;
    }

    public int getDurabilite() {
        return durabilite;
    }

    public void setDurabilite(int durabilite) {
        this.durabilite = durabilite;
    }
}
