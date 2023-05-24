public class Wizard extends MythicalBeing{

    private Boolean cloak;

    public Wizard(String name, int healthPoints, Boolean shield, String spell){
        super(name, healthPoints, shield, spell);
    }

    public String useWeaponOrSpell(Character target){
        target.reduceHealthPoints(30);
        return target.getName() + " has been attacked by " + this.getName();
    }
}
