package sample;

public class Armor {
    double armour;//dmg reduction
    int health_buff;
    int mana_buff;
    double c_buff;//critical buff
    double dmg_buff;
    // the special passive should be a method not an attribute
    public String ArSpecial()
    {
        return null;
    }
    public Armor(double armour, int health_buff, int mana_buff, double c_buff, double dmg_buff) {
        this.armour = armour;
        this.health_buff = health_buff;
        this.mana_buff = mana_buff;
        this.c_buff = c_buff;
        this.dmg_buff = dmg_buff;
    }

    public Armor() {
    }

    //you send the armour to see the reduction percentage
    public double dmgred(double armour){
        return (armour*0.3)/100;
    }
}
