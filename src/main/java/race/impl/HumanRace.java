package race.impl;

import lombok.ToString;
import race.Race;

@ToString
public class HumanRace extends Race {


    private String name;
    private int xp;
    private int health;

    public HumanRace(String name) {
        this.name = name;
        this.xp = getXp();
        this.health = getHealht();

    }

}
