public class MarioCharacter {

    private String name;
    private String item;
    private String ability;
    private int coins;

    public MarioCharacter() {
        this.name = "Dry bones";
        this.item = "No item";
        this.ability = "No ability";
        this.coins = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
    public String getName() {
        return this.name;
    }

    public String getItem() {
        return this.item;
    }

    public String getAbility() {
        return this.ability;
    }

    public int getCoins() {
        return this.coins;
    }


}
