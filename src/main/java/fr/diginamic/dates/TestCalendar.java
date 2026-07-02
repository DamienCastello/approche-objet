package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        // 19 mai 2016 23:59:30
        cal.set(2016, Calendar.MAY, 19, 23, 59, 30);

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format1.format(cal.getTime()));

        // Date du jour
        Calendar today = Calendar.getInstance();

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(format2.format(today.getTime()));

        // Français
        SimpleDateFormat fr = new SimpleDateFormat(
                "EEEE dd MMMM yyyy HH:mm:ss",
                Locale.FRENCH);

        // Russe
        SimpleDateFormat ru = new SimpleDateFormat(
                "EEEE dd MMMM yyyy HH:mm:ss",
                new Locale("ru"));

        // Chinois
        SimpleDateFormat zh = new SimpleDateFormat(
                "EEEE dd MMMM yyyy HH:mm:ss",
                Locale.CHINESE);

        // Allemand
        SimpleDateFormat de = new SimpleDateFormat(
                "EEEE dd MMMM yyyy HH:mm:ss",
                Locale.GERMAN);

        System.out.println(fr.format(today.getTime()));
        System.out.println(ru.format(today.getTime()));
        System.out.println(zh.format(today.getTime()));
        System.out.println(de.format(today.getTime()));
    }
}