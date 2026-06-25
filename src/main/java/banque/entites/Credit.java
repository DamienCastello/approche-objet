package banque.entites;

public class Credit extends Operation {
    Credit(String date, int montant){
        super(date, montant);
    }

    public String getType(){
        return "CREDIT";
    }

    public String toString() {
        return super.toString() + "\n" + "TYPE: " + getType();
    }
}
