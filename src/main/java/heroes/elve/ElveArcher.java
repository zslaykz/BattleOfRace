package heroes.elve;

import heroes.Ability;
import heroes.Actions;
import lombok.NoArgsConstructor;
import lombok.ToString;
import race.impl.ElveRace;


@ToString
public class ElveArcher extends ElveRace implements Actions {


    private String weapon;
    private int damage;
    int id;
    private int health;

    public ElveArcher(String nameOfHero, int damage, int health, String weapon, int damage1, int id, int health1) {
        super(nameOfHero, damage, health);
        this.weapon = weapon;
        this.damage = damage1;
        this.id = id;
        this.health = health1;
    }

    public int attack() {
        return 0;
    }
}
