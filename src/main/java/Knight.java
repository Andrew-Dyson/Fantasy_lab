public class Knight extends Fighter {


    public Knight(String name, int healthPoints, Boolean shield, String weapon){
        super(name, healthPoints, shield, weapon);
    }

    public String useWeaponOrSpell(Character target){
        target.reduceHealthPoints(20);
        return target.getName() + " has been attacked by " + this.getName();
    }
}
