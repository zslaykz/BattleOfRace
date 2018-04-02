package heroes.human;

import heroes.Actions;
import race.impl.HumanRace;

public class HumanWarrior extends HumanRace implements Actions {


    public HumanWarrior(String name) {
        super(name);
    }

    public int attack() {
        return 0;
    }
}
