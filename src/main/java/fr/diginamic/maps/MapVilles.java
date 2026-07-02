package fr.diginamic.maps;

import liste.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343_000));
        villes.add(new Ville("Carcassonne", 47_800));
        villes.add(new Ville("Narbonne", 53_400));
        villes.add(new Ville("Lyon", 484_000));
        villes.add(new Ville("Foix", 9_700));
        villes.add(new Ville("Pau", 77_200));
        villes.add(new Ville("Marseille", 850_700));
        villes.add(new Ville("Tarbes", 40_600));

        for(Ville ville : villes){
            map.put(ville.getNom(), ville.getNbHabitant());
        }

        Collections.sort(villes);
        Ville min = villes.getFirst();

        System.out.println(map.size());

        map.remove(min.getNom());

        System.out.println(min);
        System.out.println(map.size());
    }
}
