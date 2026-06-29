package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        String[] array = new String[] {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
        Collections.addAll(liste, array);

        int stringMax = 0;
        int indexOfMax = 0;
        for(int i = 0; i<liste.size(); i++){
            String[] split = liste.get(i).split("");
            if(i==0) {
                stringMax = split.length;
            }
            else if(split.length > stringMax){
                indexOfMax = i ;
                stringMax = split.length;
            }

        }
        System.out.println("Ville max: " + liste.get(indexOfMax));

        ListIterator<String> iter = liste.listIterator();

        while (iter.hasNext()){
            String str = iter.next();
            iter.set(str.toUpperCase());
        }

        iter = liste.listIterator();

        while (iter.hasNext()){
            String str = iter.next();
            if(str.charAt(0) == 'N') iter.remove();
        }

        System.out.println("liste finale:");
        for(String el : liste){
            System.out.println(el);
        }
    }
}
