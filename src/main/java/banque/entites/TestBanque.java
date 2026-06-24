package banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte("123456782468", 777);
        Compte compte2 = new CompteTaux("864287654321", 5050, 0.5);

        Compte[] comptes = {compte1, compte2};

        for(Compte compte : comptes){
            System.out.println(compte);
        }
    }
}
