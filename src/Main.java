public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDamage(70);
        boss.setBossHealth(1000);
        boss.setBossDefence("Physical");
        System.out.println("Boss HP: " + boss.getBossHealth() + " Boss Damage: " + boss.getBossDamage() + " Boss Defence: " + boss.getBossDefence());
        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Hero " + (i+1) + " Ability: " + heroes[i].getHeroAbility()+ " Damage: " + heroes[i].getHeroDamage() + " Health: " + heroes[i].getHeroHealth());
        }


    }
    public static Hero[]  createHeroes(){
        Hero Hero1 = new Hero("Golem", 50, 200 );
        Hero Hero2 = new Hero("Heal", 20, 250 );
        Hero Hero3 = new Hero( 90, 300 );
        return new Hero[]{Hero1, Hero2, Hero3};

    }
}