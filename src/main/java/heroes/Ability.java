package heroes;


import lombok.Getter;

@Getter
public enum Ability {

    ATTACK_BOW(0,"BOW", 10),
    ATTACK_MAG(1,"MAG", 15),
    ATTACK_SWORD(2,"SWORD", 20),

    ;


    private int id;
    private String name;
    private int damage;

    Ability(int id, String name, int damage) {
        this.id = id;
        this.name = name;
        this.damage = damage;
    }
}
