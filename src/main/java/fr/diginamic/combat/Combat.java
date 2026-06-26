package fr.diginamic.combat;

public class Combat {
    private final Personnage personnage;
    private final Creature creature;

    public Combat(Personnage personnage) {
        this.personnage = personnage;

        int random = Utils.randomiser(1, 3);

        if(random == 1) this.creature = new Loup();
        else if (random == 2) this.creature = new Gobelin();
        else this.creature = new Troll();

        while(this.personnage.getVie() > 0 && this.creature.getVie() > 0) {
            int degatsInfliges = 0;
            int attaquePersonnage = personnage.getForce() + Utils.randomiser(1, 10) + (personnage.getAttaqueRenforce() ? personnage.getAttaqueBonus() : 0);

            int attaqueCreature = this.creature.getForce() + Utils.randomiser(1, 10);

            if(attaquePersonnage > attaqueCreature){
                degatsInfliges = attaquePersonnage - attaqueCreature;
                this.creature.setVie(this.creature.getVie()-degatsInfliges);
                System.out.println("Votre personnage inflige " + degatsInfliges + " de dégâts à la créature " + this.creature.getNom() + ".");

                if(this.creature.getVie() < 0) {
                    switch (this.creature.getNom()){
                        case "Loup":
                            System.out.println("Votre personnage a vaincu la créature " + this.creature.getNom() + " et a remporté 1 point de score !");
                            this.personnage.setScore(this.personnage.getScore() + 1);
                            break;
                        case "Gobelin":
                            System.out.println("Votre personnage a vaincu la créature " + this.creature.getNom() + " et a remporté 2 point de score !");
                            this.personnage.setScore(this.personnage.getScore() + 2);
                            break;
                        case "Troll":
                            System.out.println("Votre personnage a vaincu la créature " + this.creature.getNom() + " et a remporté 5 point de score !");
                            this.personnage.setScore(this.personnage.getScore() + 5);
                            break;
                    }
                    boolean recompense = Utils.randomiser(0,1) > 0.5;
                    if(recompense){
                        random = Utils.randomiser(1, 4);

                        switch (random){
                            case 1:
                                personnage.getInventaire().add(new PotionDeVie());
                                System.out.println("Vous avez gagné une potion de vie !");
                                break;
                            case 2:
                                personnage.getInventaire().add(new PotionAttaque("inférieure"));
                                System.out.println("Vous avez gagné une potion d'attaque inférieure !");
                                break;
                            case 3:
                                personnage.getInventaire().add(new PotionAttaque("supérieure"));
                                System.out.println("Vous avez gagné une potion d'attaque supérieure !");
                                break;
                            case 4:
                                personnage.setScore(personnage.getScore() + 5);
                                System.out.println("Vous avez gagné 5 points de score bonus !");
                                break;
                        }
                    }
                }
            } else if (attaquePersonnage == attaqueCreature) {
                System.out.println("Parade !");
            } else {
                degatsInfliges = attaqueCreature - attaquePersonnage;
                this.personnage.setVie(personnage.getVie()-degatsInfliges);
                System.out.println("La créature " + this.creature.getNom() + " inflige " + degatsInfliges + " de dégâts à votre personnage.");

                if(this.personnage.getVie() < 0) System.out.println("Votre personnage est mort !");
            }
        }

        personnage.setDureeBonus(personnage.getDureeBonus() - 1);
        if (personnage.getDureeBonus() == 0) {
            personnage.setAttaqueRenforce(false);
            personnage.setAttaqueBonus(0);
        };
    }
}
