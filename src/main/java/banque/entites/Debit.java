package banque.entites;

public class Debit extends Operation {
    Debit(String date, int montant){
        super(date, montant);
    }

    String getType(){
        return "DEBIT";
    }

    public String toString() {
        return super.toString() + "\n" + "TYPE: " + getType();
    }
}
