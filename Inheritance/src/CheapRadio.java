public class CheapRadio extends Radio {

    public CheapRadio(String modulation, int channel) {
        this.modulation = modulation;
        this.radioChannel = channel;
    }

    public CheapRadio(int nums, String modulation, int channel) {
        this.volume = nums;
        this.modulation = modulation;
        this.radioChannel = channel;
    }

    public void setVolume(int nums) {
        this.volume = nums;
    }

    public void setModulation(String modulation) {
        this.modulation = modulation;
    }

    public void setRadioChannel(int channel) {
        this.radioChannel = channel;
    }
}
