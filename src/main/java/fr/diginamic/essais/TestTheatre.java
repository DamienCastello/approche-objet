package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("La main d'or", 2000, 0, 0);

        theatre.inscrire(500, 5);
        System.out.println(theatre);
        theatre.inscrire(200, 5);
        System.out.println(theatre);
        theatre.inscrire(800, 5);
        System.out.println(theatre);
        theatre.inscrire(700, 5);
        System.out.println(theatre);
    }
}
