public class Main {

    public static void main(String[] args) {
        MarioCharacters noCharacter = new MarioCharacters();
        System.out.println(noCharacter);

        MarioCharacters mario = new MarioCharacters("Mario", "Fireballs", "Mushroom");
        MarioCharacters luigi = new MarioCharacters("Luigi", "Jumping", "Fire flower");
        MarioCharacters bowser = new MarioCharacters("Bowser", "Stomping", "Bell");

        MarioCharacters[] characters = new MarioCharacters[3];
        characters[0] = mario;
        characters[1] = luigi;
        characters[2] = bowser;

        for(MarioCharacters m : characters) {
            System.out.println(m);
        }
    }
}
