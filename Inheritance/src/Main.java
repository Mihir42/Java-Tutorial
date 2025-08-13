//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Radio standard = new Radio();

        CheapRadio cheap = new CheapRadio(10, "FM", 120);
        ExpensiveRadio expensive = new ExpensiveRadio("AM", 80);
        expensive.setVolume(100, "True");

        System.out.println(cheap.volume);
        System.out.println(cheap.modulation);
        System.out.println(cheap.radioChannel);

        System.out.println(expensive.volume);
        System.out.println(expensive.modulation);
        System.out.println(expensive.radioChannel);
    }
}