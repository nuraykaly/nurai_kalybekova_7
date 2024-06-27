// Класс Witcher
public class Witcher extends Hero {
    public Witcher(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Witcher применил суперспособность " + getSuperAbilityType());
    }

    public void reviveHero(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() <= 0) {
                hero.setHealth(this.getHealth());
                this.setHealth(0);
                System.out.println("Witcher отдал свою жизнь, чтобы оживить " + hero.getClass().getSimpleName());
                break;
            }
        }
    }
}
