package fr.diginamic.combat;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        boolean partieFinie = false;
        Personnage personnage = null;
        Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenue dans le jeu !");
        while(!partieFinie){
            System.out.println("Choisir une option:");
            System.out.println("1: Créer le personnage");
            System.out.println("2: Combattre une créature");
            System.out.println("3: Boire une potion");
            System.out.println("4: Voir le score");
            System.out.println("5: Quitter");
            int choixMenu = scanner.nextInt();

            if(choixMenu == 1) {
                personnage = new Personnage();
                System.out.println(personnage);
            }
            else if(choixMenu == 2) {
                if (personnage != null) {
                    if(personnage.getVie() <= 0) {
                        System.out.println("Votre personnage est décédé. Il a obtenu le score de " + personnage.getScore() + " points. Veuillez créer un nouveau personnage");
                    } else {
                        Combat combat = new Combat(personnage);
                        if(personnage.getVie() < 0) partieFinie = true;
                    }
                } else {
                    System.out.println("Aucun personnage créé.");
                }
            } else if (choixMenu == 3) {
                if(personnage != null){
                    System.out.println("Sélectionner la potion à utiliser:");
                    System.out.println("1: Potion de vie");
                    System.out.println("2: Potion d'attaque inférieure");
                    System.out.println("3: Potion d'attaque supérieure");

                    int choixPotion = scanner.nextInt();

                    personnage.boirePotion(choixPotion);
                } else {
                    System.out.println("Aucun personnage créé.");
                }
            } else if (choixMenu == 4) {
                if(personnage != null){
                    System.out.println("Le score actuel est de " + personnage.getScore() + " points.");
                } else {
                    System.out.println("Aucun personnage créé.");
                }
            } else if (choixMenu == 5) {
                partieFinie = true;
                System.out.println("Partie abandonnée !");
            } else {
                System.out.println("Choisissez une option du menu !");
            }
        }

    }
}
