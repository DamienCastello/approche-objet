package banque.entites;

abstract class Operation {
    String date;
    int montant;

    Operation(String date, int montant){
        this.date = date;
        this.montant = montant;
    }

    public String toString() {
        return "date: " + date + " " + "montant: " + montant;
    }

    abstract String getType();
}
