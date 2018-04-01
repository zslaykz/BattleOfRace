import heroes.elve.ElveArcher;
import heroes.elve.ElveMag;


public class Arena {



    public void createHeroes(){
        ElveArcher elveArcher = new ElveArcher("Archer",20,2);
        ElveMag elveMag = new ElveMag("Mag",3,20);
        elveArcher.getNameOfRace();
        System.out.println(elveArcher);

    }

    public void startFight(){
        createHeroes();

    }

}
