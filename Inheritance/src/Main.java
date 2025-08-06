//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Radio standard = new Radio();
        standard.switchOff();
        standard.switchOn();

        CheapRadio cheap = new CheapRadio();
        cheap.setVolume(10);
        cheap.setModulation("FM");
        cheap.setRadioChannel(82);
        System.out.println(cheap.volume);
        System.out.println(cheap.modulation);
        System.out.println(cheap.radioChannel);

        ExpensiveRadio expensive = new ExpensiveRadio();
        expensive.setVolume(30);
        System.out.println(expensive.volume);
        expensive.bluetooth("On");
        System.out.println(expensive.bluetooth);
        expensive.cd();
    }
}