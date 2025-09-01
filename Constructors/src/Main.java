public class Main {

    public static void main(String[] args) {
//      Implicit default constructor
        Animal dog = new Animal();

//      Parameterized constructor
        Animal cat = new Animal("Cat");

//      Overloaded constructor
        Animal sheep = new Animal("Sheep");
        Animal wolf = new Animal("Wolf", "Carnivour");
        Animal squirrel = new Animal("Squirrel", "Herbivour", "Mammel");

    }
}
