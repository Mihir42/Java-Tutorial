public class Radio {

    // This is the basics of an radio
    // Inheritance allows us to add on to this radio
    // So we don't have to repeat things when creating new radios

    public int volume;
    public String modulation;
    public int radioChannel;

    public void switchOn() {
        System.out.println("The radio is on");
    }

    public void switchOff() {
        System.out.println("The radio is off");
    }
}
