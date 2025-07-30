//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating an object with variables unchanged
        Animal bear = new Animal();

        Animal rabbit = new Animal();
        rabbit.name = "Rabbit";
        rabbit.type = "Mammals";
        rabbit.description = "Small furry animal, distintive feature of eyes on the side of its head and hops around";
        rabbit.weight = 3;

        Animal squirrel = new Animal();
        squirrel.name = "Squirrel";
        squirrel.type = "Rodents";
        squirrel.description = "Small rodent animal, frisky";

        Animal[] animals = new Animal[3];
        animals[0] = bear;
        animals[1] = rabbit;
        animals[2] = squirrel;

        for(Animal a : animals) {
            System.out.println(a);
        }

    }
}