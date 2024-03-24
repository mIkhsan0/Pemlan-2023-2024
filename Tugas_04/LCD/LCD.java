package LCD;

public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private String cable;
    private String[] cableOptions = {"VGA", "DVI", "HDMI", "DisplayPort"};
    //isi bagian ini
    
    
    //buat method yang ada pada soal 
   

    public void setCable(int option) {
        //lengkapi method ini dengan mennggunakan array
        cable = cableOptions[option];
    }
    
    public void displayMessage() {
        //lengkapi method ini
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + cable);
    }

    public void turnOff() {
        status = "Off";
    }

    public void turnOn() {
        status = "On";
    }

    public void Freeze() {
        status = "Freeze";
    }

    public void volumeUp() {
        ++volume;
    }
    public void volumeDown() {
        --volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void brightnessUp() {
        ++brightness;
    }

    public void brightnessDown() {
        --brightness;
    }
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}

