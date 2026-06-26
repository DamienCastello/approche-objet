package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] array;

    public CalculMoyenne(double[] array){
        this.array = array;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    public void ajout(double number){
        double[] copie = Arrays.copyOf(this.array, this.array.length + 1);
        copie[copie.length - 1] = number;
        setArray(copie);
    }

    public double calcul(){
        double somme=0;
        for(double number : this.array){
            somme += number;
        }
        return somme / this.array.length;
    }
}
