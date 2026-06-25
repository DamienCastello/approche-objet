package ObjetGeometrique;

import interfaces.ObjetGeometrique;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objetGeometriques = new ObjetGeometrique[2];
        Cercle cercle = new Cercle(3);
        Rectangle rectangle = new Rectangle(3, 4);
        objetGeometriques[0] = cercle;
        objetGeometriques[1] = rectangle;

        for(ObjetGeometrique objetGeometrique : objetGeometriques){
            System.out.println(objetGeometrique);
        }
    }
}
