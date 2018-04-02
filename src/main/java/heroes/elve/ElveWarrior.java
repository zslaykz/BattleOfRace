package heroes.elve;

import heroes.Actions;
import race.impl.ElveRace;

public class ElveWarrior extends ElveRace implements Actions {


    public ElveWarrior(String nameOfRace) {
        super(nameOfRace);
    }

    public int attack() {
        return 0;
    }
}
