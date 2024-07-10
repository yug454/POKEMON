public class Item {
    private String name;
    private String type;
    private String effect;

    public Item(String name, String type, String effect) {
        this.name = name;
        this.type = type;
        this.effect = effect;
    }

    public void use(Pokemon target) {
        // Implement item effect logic here.
        System.out.println(this.name + " used on " + target.getName() + " with effect " + this.effect);
    }

    // Getters and setters for all attributes.
    public String getName() { return name; }
    public String getType() { return type; }
    public String getEffect() { return effect; }
}
