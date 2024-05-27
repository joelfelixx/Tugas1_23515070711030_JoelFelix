package enkapsulation;

public class app {
    public static void main(String[] args) {
        lcd lcd = new lcd();

        lcd.turnOn();
        lcd.setCable("HDMI");
        lcd.volumeUp();
        lcd.volumeDown();
        lcd.setVolume(51);
        lcd.brightnessUp();
        lcd.brightnessDown();
        lcd.setBrightness(38);
        
        cetakIdentitas();
        System.out.println("---------------------------");
        lcd.cetakInfo();
    }

    public static void cetakIdentitas() {
        System.out.println("Tugas 1 Enkapsulasi");
        System.out.println("Nama: Joel Felix");
        System.out.println("NIM: 235150707111030");
    }
}