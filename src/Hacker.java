// Класс Hacker
public class Hacker extends Hero {
    public Hacker(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Hacker применил суперспособность " + getSuperAbilityType());
    }

    public void hackBoss(Boss boss, Hero[] heroes, int amount) {
        boss.setHealth(boss.getHealth() - amount);
        Hero hero = heroes[(int) (Math.random() * heroes.length)];
        hero.setHealth(hero.getHealth() + amount);
        System.out.println("Hacker украл " + amount + " здоровья у босса и передал его " + hero.getClass().getSimpleName());
    }
}

