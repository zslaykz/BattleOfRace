package race;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Race {


    private String nameOfHero;
    private int damage;

    public Race(String nameOfHero, int damage) {
        this.nameOfHero = nameOfHero;
        this.damage = damage;
    }
}
