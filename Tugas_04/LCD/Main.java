package LCD;

public class Main {
    
    public static void main(String[] args) {

        LCD lcd = new LCD();
        lcd.turnOff();
        lcd.turnOn();
        lcd.Freeze();
        lcd.setVolume(50);
        lcd.volumeUp();
        lcd.setBrightness(39);
        lcd.brightnessDown();
        lcd.setCable(2);

        lcd.displayMessage();
    }
}
