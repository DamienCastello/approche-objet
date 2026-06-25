package ObjetGeometrique;

import interfaces.ObjetGeometrique;

public class Rectangle implements ObjetGeometrique {
    private final double longueur;
    private final double largeur;

    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double perimetre(){
        return 2 * (longueur + largeur);
    }

    public double surface(){
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "le périmètre du " + Rectangle.class.getSimpleName() + " est: " + perimetre() + " et la surface est: " + surface();
    }
}
