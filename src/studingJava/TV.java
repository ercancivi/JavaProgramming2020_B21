package studingJava;

public class TV {

    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(isOn() == true && (volumeLevel >= 1 && volumeLevel <= 7)) {
            this.volumeLevel = volumeLevel;

        }else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel > 0 && channel <= 120) {
            this.channel = channel;

        }else  {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void volumeUp() {
        volumeLevel++;
    }

    public void volumeDown() {
        volumeLevel--;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if(on == true) {
            System.out.println("TV is already ON");
        }
    }

    public void turnOff() {
        if(on == false) {
            System.out.println("TV is already OFF");
        }
    }


}


class Main
{
    public static void main(String[] args)
    {
       TV tv = new TV();
       tv.getBrand();
       tv.getChannel();
       tv.getVolumeLevel();

       tv.setBrand("Samsung");
       tv.setChannel(3);
       tv.setVolumeLevel(2);
       tv.on = true;
       tv.setChannel(120);
       tv.setVolumeLevel(7);

       tv.volumeDown();
       tv.channelUp();

        System.out.println("tv.getBrand() = " + tv.getBrand());
        System.out.println("tv.getChannel() = " + tv.getChannel());
        System.out.println("tv.getVolumeLevel() = " + tv.getVolumeLevel());

        TV tv1 = new TV("Sony");
        tv1.getBrand();
        tv1.getChannel();
        tv1.getVolumeLevel();

//        tv1.setBrand("Samsung");
        tv1.setChannel(-1);
        tv1.setVolumeLevel(0);
        tv1.on = true;

        System.out.println("tv1.getBrand() = " + tv1.getBrand());
        System.out.println("tv1.getChannel() = " + tv1.getChannel());
        System.out.println("tv1.getVolumeLevel() = " + tv1.getVolumeLevel());
    }
}
