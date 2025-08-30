/*
Composition - Represents a "part of" relationship
              An object is part of another object
              Allows for complex object to be created from simpler objects
              Objects although cannot exist on their own
 */
public class Main {
    public static void main(String[] args) {
        Human dave = new Human("Dave", 60, 6, true, "Big");
        System.out.println(dave.getName());
        System.out.println(dave.getWeight());
        System.out.println(dave.getHeight());
        System.out.println(dave.getHeart().isHealthy());
        System.out.println(dave.getHeart().getSize());
    }
}