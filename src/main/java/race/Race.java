package race;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public abstract class Race {


    private String nameOfRace;
    private int damage;

    public Race(String nameOfHero, int damage) {
        this.nameOfRace = nameOfHero;
        this.damage = damage;
    }
}
