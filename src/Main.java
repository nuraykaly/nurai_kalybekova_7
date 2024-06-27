public class Main {
    public static void main(String[] args) {
        // Создание героев
        Hero[] heroes = {
                new Magic(100, 50, "MAGIC ATTACK"),
                new Medic(80, 30, "HEALING", 100),
                new Warrior(120, 70, "CRITICAL DAMAGE"),
                new Witcher(150, 0, "REVIVAL"),
                new Hacker(90, 40, "HACKING")
        };

        // Создание босса
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(150);
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        boss.setWeapon(bossWeapon);

        // Симуляция раундов
        for (int round = 1; round <= 5; round++) {
            System.out.println("Раунд " + round);
            // Применение суперспособностей
            for (Hero hero : heroes) {
                hero.applySuperAbility();
                if (hero instanceof Medic) {
                    ((Medic) hero).increaseExperience();
                }
            }
            // Применение уникальных способностей
            for (Hero hero : heroes) {
                if (hero instanceof Magic) {
                    ((Magic) hero).increaseAttack(heroes, 10);
                } else if (hero instanceof Hacker && round % 2 == 0) {
                    ((Hacker) hero).hackBoss(boss, heroes, 30);
                }
            }
            // Проверка Witcher на воскрешение
            for (Hero hero : heroes) {
                if (hero instanceof Witcher && hero.getHealth() > 0) {
                    ((Witcher) hero).reviveHero(heroes);
                }
            }
        }
    }
}
