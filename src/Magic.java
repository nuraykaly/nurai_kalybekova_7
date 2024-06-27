// Класс Magic
public class Magic extends Hero {
    public Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + getSuperAbilityType());
    }

    public void increaseAttack(Hero[] heroes, int amount) {
        for (Hero hero : heroes) {
            hero.setDamage(hero.getDamage() + amount);
        }
        System.out.println("Magic увеличил атаку каждого героя на " + amount);
    }
}
