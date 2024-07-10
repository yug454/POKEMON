import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String name;
    private String type;
    private int health;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private int level;
    private int experience;
    private List<Move> moves;
    private boolean isWild;

    public Pokemon(String name, String type, int health, int attack, int defense, 
                   int specialAttack, int specialDefense, int speed, int level, 
                   boolean isWild) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.level = level;
        this.experience = 0;
        this.moves = new ArrayList<>();
        this.isWild = isWild;
    }

    public void attack(Pokemon opponent, Move move) {
        if (Math.random() * 100 < move.getAccuracy()) {
            int damage = calculateDamage(opponent, move);
            opponent.takeDamage(damage);
            System.out.println(this.name + " used " + move.getName() + " and dealt " + damage + " damage to " + opponent.getName());
        } else {
            System.out.println(this.name + " missed!");
        }
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            System.out.println(this.name + " fainted!");
        }
    }

    public void gainExperience(int exp) {
        this.experience += exp;
        if (this.experience >= 100) {
            levelUp();
            this.experience = 0;
        }
    }

    private void levelUp() {
        this.level++;
        this.health += 10;
        this.attack += 2;
        this.defense += 2;
        this.specialAttack += 2;
        this.specialDefense += 2;
        this.speed += 1;
        System.out.println(this.name + " leveled up to " + this.level + "!");
    }

    public void learnMove(Move move) {
        if (this.moves.size() < 4) {
            this.moves.add(move);
        } else {
            System.out.println(this.name + " cannot learn more than 4 moves.");
        }
    }

    private int calculateDamage(Pokemon opponent, Move move) {
        int damage = 0;
        if (move.getCategory().equals("physical")) {
            damage = ((2 * this.level / 5 + 2) * move.getPower() * this.attack / opponent.getDefense()) / 50 + 2;
        } else if (move.getCategory().equals("special")) {
            damage = ((2 * this.level / 5 + 2) * move.getPower() * this.specialAttack / opponent.getSpecialDefense()) / 50 + 2;
        }
        // Apply type effectiveness, critical hit, and other factors here.
        return damage;
    }

    // Getters and setters for all attributes.
    public String getName() { return name; }
    public String getType() { return type; }
    public int getHealth() { return health; }
    public int getLevel() { return level; }
    public List<Move> getMoves() { return moves; }
}
