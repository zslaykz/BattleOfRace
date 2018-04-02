package heroes.elve;


import heroes.Actions;
import lombok.ToString;
import race.impl.ElveRace;


@ToString
public class ElveArcher extends ElveRace implements Actions {


    private String weapon;
    private int damage;
    int id;
    private int health;

    public ElveArcher(String nameOfRace) {
        super(nameOfRace);
    }


    public int attack() {
        return 0;
    }
}
