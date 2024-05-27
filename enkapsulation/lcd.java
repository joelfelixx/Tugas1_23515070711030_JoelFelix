package enkapsulation;

public class lcd {
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    public lcd() {
        this.status = "Mati";
        this.volume = 0;
        this.brightness = 0;
        this.cable = "unplugged";
    }

    public void turnOn() {
        this.status = "Menyala";
    }

    public void turnOff() {
        this.status = "Mati";
    }

    public void freeze() {
        this.status = "Freeze";
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        this.volume--;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void brightnessUp() {
        this.brightness++;
    }

    public void brightnessDown() {
        this.brightness--;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public void cetakInfo() {
        System.out.println("LCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable);
    }
}