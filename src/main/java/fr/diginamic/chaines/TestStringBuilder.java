package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<=100000; i++){
            builder.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes (SB) :" + (fin - debut));

        long debut2 = System.currentTimeMillis();
        String chaine = "";
        for(int i=0; i<=100000; i++){
            chaine = chaine+i;
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));
    }
}
