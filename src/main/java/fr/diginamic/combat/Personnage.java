package fr.diginamic.combat;

import java.util.ArrayList;
import java.util.List;

public class Personnage extends Entity{
    private int score;
    private List<Potion> inventaire;
    private boolean attaqueRenforce = false;
    private int dureeBonus = 0;
    private int attaqueBonus = 0;

    public Personnage() {
        super(Utils.randomiser(12, 18), Utils.randomiser(20, 50));
        this.score = 0;
        this.inventaire = new ArrayList<>();
        this.inventaire.add(new PotionDeVie());
        this.inventaire.add(new PotionAttaque("inférieure"));
        this.inventaire.add(new PotionAttaque("supérieure"));
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Potion> getInventaire() {
        return inventaire;
    }

    public void setInventaire(List<Potion> inventaire) {
        this.inventaire = inventaire;
    }

    public boolean getAttaqueRenforce(){
        return this.attaqueRenforce;
    }

    public void setAttaqueRenforce(boolean attaqueRenforce) {
        this.attaqueRenforce = attaqueRenforce;
    }

    public int getDureeBonus() {
        return dureeBonus;
    }

    public void setDureeBonus(int dureeBonus) {
        this.dureeBonus = dureeBonus;
    }

    public int getAttaqueBonus() {
        return attaqueBonus;
    }

    public void setAttaqueBonus(int attaqueBonus) {
        this.attaqueBonus = attaqueBonus;
    }

    public void boirePotion(int choixPotion){
        boolean potionConsomme = false;
        if(choixPotion == 1){
            System.out.println(this.getInventaire());

            for(int i = 0; i < this.getInventaire().size(); i++){
                if(this.getInventaire().get(i).getClass().getSimpleName().equals("PotionDeVie")){
                    potionConsomme = true;
                    PotionDeVie potion = new PotionDeVie();
                    this.setVie(this.getVie()+potion.getMontant());
                    this.getInventaire().remove(i);
                    break;
                }
            }
        } else if(choixPotion == 2){
            System.out.println(this.getInventaire());

            for(int i = 0; i < this.getInventaire().size(); i++){
                if(this.getInventaire().get(i).getClass().getSimpleName().equals("PotionAttaque")){
                    if(this.getInventaire().get(i).getNom().equals("Potion d'attaque inférieure")){
                        potionConsomme = true;
                        PotionAttaque potion = new PotionAttaque("inférieure");
                        this.setAttaqueBonus(getAttaqueBonus() + 3);
                        this.setAttaqueRenforce(true);
                        this.setDureeBonus(potion.getDurabilite());
                        this.getInventaire().remove(i);
                        break;
                    }
                }
            }
        } else if(choixPotion == 3){
            for(int i = 0; i < this.getInventaire().size(); i++){
                if(this.getInventaire().get(i).getClass().getSimpleName().equals("PotionAttaque")){
                    if(this.getInventaire().get(i).getNom().equals("Potion d'attaque supérieure")){
                        potionConsomme = true;
                        PotionAttaque potion = new PotionAttaque("supérieure");
                        this.setAttaqueBonus(getAttaqueBonus() + 5);
                        this.setAttaqueRenforce(true);
                        this.setDureeBonus(potion.getDurabilite());
                        this.getInventaire().remove(i);
                        break;
                    }
                }
            }
        } else {
            System.out.println("Choix invalide !");
        }
        if(!potionConsomme) System.out.println("Tu ne possède pas cette potion...");
    }

    @Override
    public String toString() {
        String nomClasseFille = Thread.currentThread().getStackTrace()[1].getClassName();
        String[] split = nomClasseFille.split("\\.");
        return "Entité " + split[split.length - 1] + " avec " + super.toString();
    }
}
