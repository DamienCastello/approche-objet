package fr.diginamic.combat;

public class Gobelin extends Creature {
    public Gobelin() {
        super(Utils.randomiser(5, 10), Utils.randomiser(10, 15));
    }

    public String getNom() {
        String nomClasseFille = Thread.currentThread().getStackTrace()[1].getClassName();
        String[] split = nomClasseFille.split("\\.");

        return split[split.length - 1];
    }
}
