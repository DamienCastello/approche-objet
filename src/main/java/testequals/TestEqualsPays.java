package testequals;

public class TestEqualsPays {
    public static void main(String[] args) {

        Pays p1 = new Pays("France", 69);
        Pays p2 = new Pays("France", 69);
        Pays p3 = new Pays("Francee", 69);
        Pays p4 = new Pays("France", 68);

        Pays p5 = new Pays(null, 69);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals("12563"));

        System.out.println(p1.equals(p5));
        System.out.println(p5.equals(p1));
    }
}