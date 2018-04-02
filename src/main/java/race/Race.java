package race;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor

public abstract class Race {


    private String nameOfRace;
    private int healht = 100;
    private int xp =0;

    public Race(String nameOfRace) {
        this.nameOfRace = nameOfRace;
    }
}
