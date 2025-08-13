import java.security.cert.Extension;

public class ExpensiveRadio extends CheapRadio{

    public String bluetooth;

    // Using super to use parent constructor to set variables
    public ExpensiveRadio(String modulation, int channel) {
        super(modulation, channel); // Has to be the first line of the constructor
    }

    // Method overriding on setVolume and super keyword used to call parent method
    public void setVolume(int num, String override) {
        if(override.equals("False")) {
            if(num <= 20) {
                this.volume = num;
            } else {
                System.out.println("Invalid volume");
            }
        }
        else {
            super.setVolume(num);
        }
    }

    public void bluetooth (String status){
        if(status.equals("On")) {
            this.bluetooth = status;
        } else {
            bluetooth = "Off";
        }
    }

    public void cd() {
        // System.out.println("CD has been added");
    }

}
