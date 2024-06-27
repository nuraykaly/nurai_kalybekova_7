public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss health: " + getHealth());
        System.out.println("Boss damage: " + getDamage());
        System.out.println("Boss weapon type: " + weapon.getType());
        System.out.println("Boss weapon name: " + weapon.getName());
    }
}