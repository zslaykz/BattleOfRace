package race;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public abstract class Race {


    private String nameOfRace;
    private int healht;

    public Race(String nameOfHero, int damage) {
        this.nameOfRace = nameOfHero;
        this.healht = 100;
    }
}
