package fr.diginamic.maps;

import entities3.Pays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        Pays pays1 = new Pays("France", "Europe", 65_000_000);
        Pays pays2 = new Pays("Allemagne", "Europe", 80_000_000);
        Pays pays3 = new Pays("Belgique", "Europe", 10_000_000);
        Pays pays4 = new Pays("Russie", "Asie", 150_000_000);
        Pays pays5 = new Pays("Chine", "Asie", 1_400_000_000);
        Pays pays6 = new Pays("Indonésie", "Océanie", 220_000_000);
        Pays pays7 = new Pays("Australie", "Océanie", 20_000_000);

        ArrayList<Pays> pays = new ArrayList<>(Arrays.asList(pays1, pays2, pays3, pays4, pays5, pays6, pays7));

        HashMap<String, Integer> map = new HashMap<>();

        for (Pays p : pays) {
            String continent = p.getContinent();

            if (map.containsKey(continent)) {
                map.put(continent, map.get(continent) + 1);
            } else {
                map.put(continent, 1);
            }
        }

        System.out.println(map);
    }
}
