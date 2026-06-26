package fr.diginamic.operations;

public class Operations {
    public double calcul(double a, double b, char operateur){
        return switch (operateur){
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) throw new ArithmeticException("Division par zéro impossible.");
                yield a / b;
            }
            default ->  throw new IllegalArgumentException("Opérateur incorrect: " + operateur);
        };
    }
}
