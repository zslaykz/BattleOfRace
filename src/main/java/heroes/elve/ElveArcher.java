package heroes.elve;

import heroes.Ability;
import heroes.Actions;
import race.impl.ElveRace;

public class ElveArcher extends ElveRace implements Actions {


    private String weapon;
    private int damage;
    int id;

    public ElveArcher(Ability[] ability, String weapon, int damage, int id) {
        this.weapon = weapon;
        this.damage = damage;
        this.id = id;
    }

    public int attack() {
        return 0;
    }
}
