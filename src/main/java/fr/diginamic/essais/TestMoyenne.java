package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne moyenne = new CalculMoyenne(new double[] {2.0, 2.5, 4.5});
        System.out.println("Premier test (résultat attendu -> 3): " + moyenne.calcul());
        moyenne.ajout(7);
        System.out.println("Second test (résultat attendu -> 4): " + moyenne.calcul());
    }
}
