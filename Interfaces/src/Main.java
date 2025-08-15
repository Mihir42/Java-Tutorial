import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.name("Apple");
        apple.colour("Red");
        String[] vitamins = {"Vitamin A", "Vitamin B", "Iron"};
        apple.vitamins(vitamins);
        apple.shape("Shape");

        System.out.println(apple.shape);
        System.out.println(apple.colour);
        System.out.println(Arrays.toString(apple.vitamins));
        System.out.println(apple.shape);
    }
}