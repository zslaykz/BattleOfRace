package race.impl;

import race.Race;

public class ElveRace extends Race {

    private int health;

    public ElveRace(String nameOfHero, int damage, int health) {
        super(nameOfHero, damage);
        this.health = health;
    }
}
