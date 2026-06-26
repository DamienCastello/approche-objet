package fr.diginamic.chaines;

import fr.diginamic.entities.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        int taille = chaine.length();
        System.out.println("Longueur chaine: " + taille);

        int separateurIndex = chaine.indexOf(";");
        System.out.println("Premier ';' trouvé à l'index: " + separateurIndex);

        String nom = chaine.substring(0, separateurIndex);
        System.out.println("Le nom extrait est: " + nom);

        String nomMaj = nom.toUpperCase();
        System.out.println("nom en majuscule: " + nomMaj);

        String nomMin = nom.toLowerCase();
        System.out.println("nom en minuscule: " + nomMin);

        String[] infos = chaine.split(";");
        for(String element : infos){
            System.out.println("element: " + element);
        }

        Salarie salarie1 = new Salarie(infos[0], infos[1], Double.parseDouble(infos[2].replace(" ", "")));
        System.out.println(salarie1);
    }
}
