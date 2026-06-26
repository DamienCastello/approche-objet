package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("LASTICO", "COCO", 1800);
        Pigiste pigiste = new Pigiste("ABERKANE", "IDRISS", 2, 90);

        System.out.println(salarie);
        System.out.println(pigiste);
    }
}
