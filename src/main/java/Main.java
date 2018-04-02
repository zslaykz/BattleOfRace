import race.Race;
import race.impl.ElveRace;
import race.impl.HumanRace;

public class Main {
    public static void main(String[] args) {
        ElveRace elveRace = new ElveRace("Elve");
        System.out.println(elveRace);

        HumanRace humanRace = new HumanRace("Human");
        System.out.println(humanRace);


    }
}
