/*
Class MarioCharacters, has two constructors
One constructor is for empty, when the user does not pass in parameters when creating a object
The other constructor is for when the user does pass in parameters when creating a constuctor
This is called overloaded constructors
 */

public class MarioCharacters {

    public String name;
    public String ability;
    public String item;

    public MarioCharacters() {
        this.name = null;
        this.ability = null;
        this.item = null;
    }

    public MarioCharacters(String name, String ability, String item) {
        this.name = name;
        this.ability = ability;
        this.item = item;
    }

    @Override
    public String toString() {
        return this.name + " " + this.ability + " " + this.item;
    }

}
