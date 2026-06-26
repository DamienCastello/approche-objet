package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
    private Piece[] pieces;

    public Maison(Piece[] pieces) {
        this.pieces = pieces;
    }

    public void setPieces(Piece[] pieces) {
        this.pieces = pieces;
    }

    public void ajouterPiece(Piece piece) {
        if(piece == null) return;
        Piece[] copiePieces = Arrays.copyOf(this.pieces, this.pieces.length + 1);
        copiePieces[copiePieces.length - 1] = piece;
        setPieces(copiePieces);
    }

    public double getSuperficieParEtage(int etage){
        double superficieParEtage = 0;
        for(Piece piece : this.pieces){
            if(piece.numeroEtage == etage) superficieParEtage += piece.superficie;
        }
        return superficieParEtage;
    }

    public double getSuperficieTotale(){
        double superficieTotale = 0;
        for(Piece piece : this.pieces){
            superficieTotale += piece.superficie;
        }
        return superficieTotale;
    }

    public double getSuperficieParTypePiece(String typePiece){
        double superficieParTypePiece = 0;
        for(Piece piece : this.pieces){
            if(piece.getClass().getSimpleName().equalsIgnoreCase(typePiece)) superficieParTypePiece += piece.superficie;
        }
        return superficieParTypePiece;
    }

    public int getNbPieceParTypePiece(String typePiece){
        int nbPieceParTypePiece = 0;
        for(Piece piece : this.pieces){
            if(piece.getClass().getSimpleName().equalsIgnoreCase(typePiece)) nbPieceParTypePiece += 1;
        }
        return nbPieceParTypePiece;
    }
}
