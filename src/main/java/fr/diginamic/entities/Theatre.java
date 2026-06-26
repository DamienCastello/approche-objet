package fr.diginamic.entities;

public class Theatre {
    private final String nom;
    private final int capacityMax;
    private int clientsInscrits;
    private int recetteTotale;

    public Theatre(String nom, int capacityMax, int clientsInscrits, int recetteTotale){
        this.nom = nom;
        this.capacityMax = capacityMax;
        this.clientsInscrits = clientsInscrits;
        this.recetteTotale = recetteTotale;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacityMax() {
        return capacityMax;
    }

    public int getClientsInscrits() {
        return clientsInscrits;
    }

    public void setClientsInscrits(int clientsInscrits) {
        this.clientsInscrits = clientsInscrits;
    }

    public int getRecetteTotale() {
        return recetteTotale;
    }

    public void setRecetteTotale(int recetteTotale) {
        this.recetteTotale = recetteTotale;
    }

    public void inscrire(int nombreClients, int prixPlace){
        if(nombreClients <= this.capacityMax - this.clientsInscrits){
            this.clientsInscrits += nombreClients;
            this.recetteTotale += prixPlace * nombreClients;
        } else {
            throw new RuntimeException("La capacité restante est insuffisante pour le nombre de clients à inscrire.");
        }
    }

    @Override
    public String toString() {
        return "Nombre clients inscrits: " + this.clientsInscrits + " et recette évaluée à " + this.recetteTotale + "€";
    }
}
