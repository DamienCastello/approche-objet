package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations operation = new Operations();

        System.out.println("Test '+': " + operation.calcul(2, 3, '+'));
        System.out.println("Test '-': " + operation.calcul(2, 3, '-'));
        System.out.println("Test '*': " + operation.calcul(2, 3, '*'));
        System.out.println("Test '/': " + operation.calcul(2, 3, '/'));
    }
}
