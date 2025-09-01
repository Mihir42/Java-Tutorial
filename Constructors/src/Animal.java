public class Animal {

    public String name;
    public String diet;
    public String species;

//  Implicit Default constructor - Compilers automatically provided constructor
//  Explicit Default constructor
    public Animal() {
        System.out.println("An default animal constructor has been created");
    }

//  Parameterized constructor and constructor overloading
    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String diet) {
        this.name = name;
        this.diet = diet;
    }

    public Animal(String name, String diet, String species) {
        this.name = name;
        this.diet = diet;
        this.species = species;
    }
}
