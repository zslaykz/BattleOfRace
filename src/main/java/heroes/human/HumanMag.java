package heroes.human;

import heroes.Actions;
import race.impl.HumanRace;

public class HumanMag extends HumanRace implements Actions {


    public HumanMag(String name) {
        super(name);
    }

    public int attack() {
        return 0;
    }
}
