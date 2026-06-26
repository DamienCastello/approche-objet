package fr.diginamic.combat;

abstract class Entity {
    private int force;
    private int vie;

    public Entity(int force, int vie) {
        this.force = force;
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    @Override
    public String toString() {
        return this.force + " force et " + this.vie + " points de vie";
    }
}
