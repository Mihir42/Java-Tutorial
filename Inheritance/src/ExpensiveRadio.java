public class ExpensiveRadio extends CheapRadio{

    public String bluetooth;

    public void setVolume(int num) {
        if(num <= 20) {
            this.volume = num;
        } else {
            System.out.println("Invalid volume");
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
        System.out.println("CD has been added");
    }
}
