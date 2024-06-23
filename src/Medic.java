public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String superAbilityType, int healPoints) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void increaseExperience() {
        healPoints *= 1.1;
        System.out.println("Medic увеличил опыт лечения до " + healPoints);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + getSuperAbilityType());
    }
}