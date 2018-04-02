package heroes.elve;

import heroes.Actions;
import race.impl.ElveRace;

public class ElveMag extends ElveRace implements Actions {
    private String weapon;
    private int id;
    private int damage;

    public ElveMag(String nameOfRace) {
        super(nameOfRace);
    }


    public int attack() {
        return 0;
    }
}
