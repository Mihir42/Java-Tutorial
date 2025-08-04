/*
    Encapsulation means the data of a class is hidden from users, protecting sensitive data
    You can also add constraints to setters to make sure inproper data is not set into the object
    Getters and setters prevent direct access to variables from other classes
 */
public class Main {
      public static void main(String[] args) {
        MarioCharacter mario = new MarioCharacter();
        mario.setName("Mario");
        mario.setAbility("Jumping");
        mario.setItem("Fireballs");
        mario.setCoins(10);

        System.out.println(mario.getName() + " " + mario.getItem() + " " + mario.getAbility() + " " + mario.getCoins());

    }
}