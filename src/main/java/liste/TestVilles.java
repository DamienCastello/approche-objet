package liste;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343_000));
        villes.add(new Ville("Carcassonne", 47_800));
        villes.add(new Ville("Narbonne", 53_400));
        villes.add(new Ville("Lyon", 484_000));
        villes.add(new Ville("Foix", 9_700));
        villes.add(new Ville("Pau", 77_200));
        villes.add(new Ville("Marseille", 850_700));
        villes.add(new Ville("Tarbes", 40_600));

        int max = 0;
        int indexOfMax = 0;
        for(int i = 0; i<villes.size(); i++){
            if(i==0) max = villes.get(i).getNbHabitant();
            else if (villes.get(i).getNbHabitant() > max) {
                max = villes.get(i).getNbHabitant();
                indexOfMax = i;
            }
        }
        System.out.println(villes.get(indexOfMax).getNom());

        int min = 0;
        int indexOfMin = 0;
        for(int i = 0; i<villes.size(); i++){
            if(i==0) min = villes.get(i).getNbHabitant();
            else if (villes.get(i).getNbHabitant() < min) {
                min = villes.get(i).getNbHabitant();
                indexOfMin = i;
            }
        }

        villes.remove(indexOfMin);

        ListIterator<Ville> iter = villes.listIterator();

        while (iter.hasNext()){
            Ville ville = iter.next();
            if(ville.getNbHabitant() > 100_000) ville.setNom(ville.getNom().toUpperCase());
        }

        System.out.println("liste finale:");
        for(Ville el : villes){
            System.out.println(el);
        }
    }
}
