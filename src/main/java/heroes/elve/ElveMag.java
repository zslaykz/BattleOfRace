package heroes.elve;

import heroes.Actions;
import race.impl.ElveRace;

public class ElveMag extends ElveRace implements Actions {
    private String weapon;
    private int id;
    private int damage;

    public ElveMag(String nameOfHero, int damage, int health, String weapon, int id, int damage1) {
        super(nameOfHero, damage, health);
        this.weapon = weapon;
        this.id = id;
        this.damage = damage1;
    }

    public int attack() {
        return 0;
    }
}
