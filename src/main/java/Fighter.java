public abstract class Fighter extends Character{

    private String weapon;

    public Fighter(String name, int healthPoints, Boolean shield, String weapon){
        super(name, healthPoints, shield);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }


}
