interface Fruit {

    public void name(String name);
    public void colour(String colour);
    public void vitamins(String[] vitamins);
    public void shape(String shape);

}

class Apple implements Fruit {

    public String name;
    public String colour;
    public String[] vitamins;
    public String shape;

    public void name(String name) {
        this.name = name;
    }

    public void colour(String colour) {
        this.colour = colour;
    }

    public void vitamins(String[] vitamins) {
        this.vitamins = vitamins;
    }

    public void shape(String shape) {
        this.shape = shape;
    }
}