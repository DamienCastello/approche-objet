package liste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        int[] array = new int[] {-1, 5, 7, 3, -2, 4, 8, 5};
        for(int nb : array) liste.add(nb);

        for(int el : liste){
            System.out.println(el);
        }

        System.out.println("Size: " + liste.size());

        int indexOfMax = 0;
        for(int i=0; i<liste.size(); i++){
            if(i == 0) indexOfMax = i;
            else if(liste.get(i) > liste.get(indexOfMax)) indexOfMax = i;
        }
        System.out.println("index max: " + indexOfMax);


        int indexMin = 0;

        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i) < liste.get(indexMin)) {
                indexMin = i;
            }
        }

        liste.remove(indexMin);
        System.out.println("après suppression:");
        for(int el : liste){
            System.out.println(el);
        }


        ListIterator<Integer> it = liste.listIterator();

        while (it.hasNext()) {
            Integer nb = it.next();

            if (nb < 0) {
                it.set(-nb);
            }
        }

        System.out.println("liste finale:");
        for(int el : liste){
            System.out.println(el);
        }
    }
}
