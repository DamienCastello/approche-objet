package fr.diginamic.tri;

import liste.Ville;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestTri {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        Ville ville1 = new Ville("TotoCity", 777);
        Ville ville2 = new Ville("Arles", 50000);
        Ville ville3 = new Ville("Montpellier", 300000);
        Ville ville4 = new Ville("Marseille", 4500000);
        Collections.addAll(villes, ville1, ville2, ville3, ville4);
        Collections.sort(villes);
        System.out.println(villes);
    }
}
