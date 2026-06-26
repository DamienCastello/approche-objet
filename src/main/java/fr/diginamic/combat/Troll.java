package fr.diginamic.combat;

public class Troll extends Creature{
    public Troll() {
        super(Utils.randomiser(10, 15), Utils.randomiser(20, 30));
    }

    public String getNom() {
        String nomClasseFille = Thread.currentThread().getStackTrace()[1].getClassName();
        String[] split = nomClasseFille.split("\\.");

        return split[split.length - 1];
    }
}
