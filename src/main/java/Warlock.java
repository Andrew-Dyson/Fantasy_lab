public class Warlock extends MythicalBeing{

    private Boolean magical;

    public Warlock(String name, int healthPoints, Boolean shield, String spell){
        super(name, healthPoints, shield, spell);
    }

    public String useWeaponOrSpell(Character target){
        target.reduceHealthPoints(15);
        return target.getName() + " has been attacked by " + this.getName();
    }
}
