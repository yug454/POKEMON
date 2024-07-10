import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private List<Pokemon> team;
    private List<Item> inventory;

    public Trainer(String name) {
        this.name = name;
        this.team = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    public void catchPokemon(Pokemon wildPokemon) {
        if (wildPokemon.isWild()) {
            team.add(wildPokemon);
            wildPokemon.setWild(false);
            System.out.println(this.name + " caught " + wildPokemon.getName() + "!");
        } else {
            System.out.println(wildPokemon.getName() + " cannot be caught!");
        }
    }

    public void useItem(Item item, Pokemon target) {
        item.use(target);
        inventory.remove(item);
    }

    public void battle(Trainer opponent) {
        System.out.println(this.name + " is battling " + opponent.getName() + "!");
        // Implement battle logic here.
    }

    // Getters and setters for all attributes.
    public String getName() { return name; }
    public List<Pokemon> getTeam() { return team; }
    public List<Item> getInventory() { return inventory; }
}
