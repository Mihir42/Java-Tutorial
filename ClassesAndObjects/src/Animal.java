public class Animal {

    public String name = "Bear";
    public String type = "Mammal";
    public String description = "Big brown furry animal, walks on 4 legs, very dangerous";
    public int weight = 600;

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public int getWeight() {
        return this.weight;
    }

    public void eat(int num) {
        this.weight += num;
        System.out.println("The fat fuck now weight " + this.weight);
    }

    @Override
    public String toString() {
        return this.name + " " + " " + this.type + " " + this.description + " " + this.weight;
    }
}
