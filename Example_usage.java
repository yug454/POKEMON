public class Main {
    public static void main(String[] args) {
        // Create some moves
        Move tackle = new Move("Tackle", "Normal", 40, 100, "physical", "None");
        Move flamethrower = new Move("Flamethrower", "Fire", 90, 100, "special", "Burn");

        // Create some Pokémon
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 35, 55, 40, 50, 50, 90, 5, true);
        Pokemon charmander = new Pokemon("Charmander", "Fire", 39, 52, 43, 60, 50, 65, 5, true);

        // Learn moves
        pikachu.learnMove(tackle);
        charmander.learnMove(flamethrower);

        // Create a trainer
        Trainer ash = new Trainer("Ash");

        // Catch Pokémon
        ash.catchPokemon(pikachu);
        ash.catchPokemon(charmander);

        // Battle
        ash.battle(new Trainer("Gary"));
    }
}
