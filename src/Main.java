public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 50, "MAGIC ATTACK"),
                new Medic(80, 30, "HEALING", 100),
                new Warrior(120, 70, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}
