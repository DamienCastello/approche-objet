package fr.diginamic.maison;

public class Piece {
    double superficie;
    int numeroEtage;

    public Piece(double superficie, int numeroEtage) {
        if(superficie < 0 || numeroEtage < 0) return;
        this.superficie = superficie;
        this.numeroEtage = numeroEtage;
    }

    double getSuperficie(){
        return this.superficie;
    }
}
