package fr.diginamic.combat;

abstract class Creature extends Entity {
    public Creature(int force, int vie) {
        super(force, vie);
    }

    abstract String getNom();

    @Override
    public String toString() {
        return "force creature : " + this.getForce();
    }
}
