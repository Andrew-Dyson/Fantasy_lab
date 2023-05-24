public abstract class Character {

    private String name;
    private int healthPoints;

    private Boolean shield;

    public Character(String name, int healthPoints, Boolean shield){
        this.name = name;
        this.healthPoints = healthPoints;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public Boolean getShield() {
        return shield;
    }

    public void setShieldToTrue() {
        this.shield = true;
    }

    public void reduceHealthPoints(int pointsToReduceBy) {
        this.healthPoints -= pointsToReduceBy;
    }

    public String useWeaponOrSpell(Character target){
        if (this.getShield()) {
            target.reduceHealthPoints(0);
            return target.getName() + " has been unsuccessfully attacked by " + this.getName();
        }
        else{
            target.reduceHealthPoints(10);
            return target.getName() + " has been successfully attacked by " + this.getName();
        }
    }
}
