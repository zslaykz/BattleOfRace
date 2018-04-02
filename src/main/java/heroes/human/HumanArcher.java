package heroes.human;

import heroes.Actions;
import race.impl.HumanRace;

public class HumanArcher extends HumanRace implements Actions {

    public HumanArcher(String name) {
        super(name);
    }

    public int attack() {
        return 0;
    }
}
