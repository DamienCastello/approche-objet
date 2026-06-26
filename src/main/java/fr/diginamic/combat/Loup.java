package fr.diginamic.combat;

public class Loup extends Creature{
    public Loup() {
        super(Utils.randomiser(3, 8), Utils.randomiser(5, 10));
    }

    public String getNom() {
        String nomClasseFille = Thread.currentThread().getStackTrace()[1].getClassName();
        String[] split = nomClasseFille.split("\\.");

        return split[split.length - 1];
    }
}
