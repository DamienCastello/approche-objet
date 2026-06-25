package banque.entites;

abstract class Operation {
    private String date;
    private int montant;

    Operation(String date, int montant){
        this.date = date;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String toString() {
        return "date: " + date + " " + "montant: " + montant;
    }

    abstract String getType();
}
