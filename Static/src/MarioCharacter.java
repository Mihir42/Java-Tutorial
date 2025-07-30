/*
Mario characters all collect coins
Multiplayer mode means all characters share a balance of coins
Reason why this was used as a static example
 */

public class MarioCharacter {

    public String name;
    public String ability;
    public String item;

    public static int coins;

    public MarioCharacter(String name, String ability, String item) {
        this.name = name;
        this.ability = ability;
        this.item = item;
    }

    public void addCoins(int coins) {
        MarioCharacter.coins += coins;
    }

    public static void getCoins() {
        System.out.println(coins);
    }
}
