package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Salon salon1 = new Salon(35.2, 0);
        Cuisine cuisine1 = new Cuisine(11.4, 0);
        Chambre chambre1 = new Chambre(15.0, 0);
        SalleDeBain salleDeBain1 = new SalleDeBain(9.7, 0);
        WC wc1 = new WC(7.8, 0);
        Chambre chambre2 = new Chambre(12.0, 1);
        Chambre chambre3 = new Chambre(13.2, 1);
        SalleDeBain salleDeBain2 = new SalleDeBain(9.7, 1);
        WC wc2 = new WC(7.8, 1);

        Maison maison1 = new Maison(
            new Piece[]{
                    salon1,
                    cuisine1,
                    chambre1,
                    salleDeBain1,
                    wc1,
                    chambre2,
                    chambre3
            }
        );

        maison1.ajouterPiece(salleDeBain2);
        maison1.ajouterPiece(wc2);

        maison1.ajouterPiece(null);

        System.out.println("superficie pour l'étage 1: " + maison1.getSuperficieParEtage(1));
        System.out.println("superficie totale: " + maison1.getSuperficieTotale());

        System.out.println("superficie par type de pièce: " + maison1.getSuperficieParTypePiece("WC"));

        System.out.println("nombre de pièces par type de pièce: " + maison1.getNbPieceParTypePiece("WC"));
    }
}
