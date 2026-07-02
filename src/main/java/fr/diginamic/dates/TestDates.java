package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {

        // Date du jour
        Date aujourdHui = new Date();

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format1.format(aujourdHui));

        // 19/05/2016 23:59:30
        Date date2016 = new Date(116, 4, 19, 23, 59, 30);

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(format2.format(date2016));

        // Date/heure système
        Date maintenant = new Date();
        System.out.println(format2.format(maintenant));
    }
}