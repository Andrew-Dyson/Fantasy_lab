public abstract class MythicalBeing extends Character {

    private String spell;

    public MythicalBeing(String name, int healthPoints, Boolean shield, String spell){
        super(name, healthPoints, shield);
        this.spell = spell;
    }

    public String getSpell() {
        return spell;
    }


}
