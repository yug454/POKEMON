public class Move {
    private String name;
    private String type;
    private int power;
    private int accuracy;
    private String category;
    private String effect;

    public Move(String name, String type, int power, int accuracy, String category, String effect) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.category = category;
        this.effect = effect;
    }

    public void applyEffect(Pokemon target) {
        // Implement effect logic here.
        System.out.println(this.name + " applies " + this.effect + " effect on " + target.getName());
    }

    // Getters and setters for all attributes.
    public String getName() { return name; }
    public String getType() { return type; }
    public int getPower() { return power; }
    public int getAccuracy() { return accuracy; }
    public String getCategory() { return category; }
    public String getEffect() { return effect; }
}
