/*
Static variables and methods can be accessed without creating an object of the class
Static variables and methods are shared between object, only a single copy is created
The class owns the variables and attributes, not the object
 */

public class Main {
    public static void main(String[] args) {

        MarioCharacter mario = new MarioCharacter("Mario", "Fireballs", "Mushroom");
        MarioCharacter luigi = new MarioCharacter("Luigi", "Jumping higher", "Fire flower");

        mario.addCoins(5);
        luigi.addCoins(5);

        // 2 Different ways of getting a static attribute,
        System.out.println(MarioCharacter.coins);
        MarioCharacter.getCoins();
    }
}