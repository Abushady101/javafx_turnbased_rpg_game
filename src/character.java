package sample;

public class character {
    //kindly add the super class up there
    double mana;
    double health;
    double damage;
    double cchance;//critical chance
    double cdamage;//critical damage which should equal a % of the base damage
    double armor;
//works as an update function for power ups

    public character() {
    }

    public character(double mana, double health, double damage, double cchance, double cdamage, double armor) {

        this.mana = mana;
        this.health = health;
        this.damage = damage;
        this.cchance = cchance;
        this.cdamage = cdamage;
        this.armor= armor;
    }


}


