public class Hero {
    private String heroAbility;
    private int heroDamage;
    private int heroHealth;

    public Hero(String heroAbility, int heroDamage, int heroHealth) {
        this.heroAbility = heroAbility;
        this.heroDamage = heroDamage;
        this.heroHealth = heroHealth;
    }

    public Hero(int heroDamage, int heroHealth) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroAbility = "no ability";
    }

    public String getHeroAbility() {
        return heroAbility;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }
}
