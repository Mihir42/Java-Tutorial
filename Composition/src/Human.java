public class Human {

    private String name;
    private int weight;
    private int height;

    private Heart heart;

    public Human(String name, int weight, int height, boolean healthy, String size) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.heart = new Heart(healthy, size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }
}
