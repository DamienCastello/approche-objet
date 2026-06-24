package banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        Credit operation1 = new Credit("20-05-26", 30);
        Credit operation2 = new Credit("29-05-26", 100);
        Debit operation3 = new Debit("15-06-26", 90);
        Debit operation4 = new Debit("21-06-26", 15);
        Operation[] operations = {operation1, operation2, operation3, operation4};

        int montantGlobal = 0;
        for(Operation operation : operations) {
            if(operation.getType().equals("DEBIT")) montantGlobal -= operation.montant;
            if(operation.getType().equals("CREDIT")) montantGlobal += operation.montant;
            System.out.println(operation + "\n");
        }
        System.out.println("Montant global: " + montantGlobal + "\n");
    }
}
