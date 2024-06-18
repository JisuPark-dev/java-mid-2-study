package oop2;

public class MusicPlayer {
    int volume;
    boolean isOn;

    public MusicPlayer(int volume, boolean isOn) {
        this.volume = volume;
        this.isOn = isOn;
    }

    public void on() {
        this.isOn = true;
        System.out.println("Music is on");
    }
    public void off() {
        this.isOn = false;
        this.volume = 0;
        System.out.println("Music is off");
    }

    public void volumeUp() {
        this.volume++;
        System.out.println("Music volume up " + this.volume);
    }
    public void volumeDown() {
        this.volume--;
        System.out.println("Music volume down " + this.volume);
    }

    public void showStatus() {
        System.out.println("volume: " + this.volume);
        System.out.println("isOn: " + this.isOn);
    }
}
