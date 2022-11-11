package company;

public class Television implements ElectronicDevice {

 private int volume = 0;
    @Override
    public void turnOn() {
        System.out.println("TV is On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is Off");
    }

    @Override
    public void turnUp() {
        if(volume>=0 && volume<=100) {
            volume+=2;
            System.out.println("TV Volume is increasing to: " +volume);
        }
        else{
            System.out.println("Action can't be performed");
        }
    }

    @Override
    public void turnDown() {
        if (volume >= 0 && volume <= 100) {
            volume -= 2;
            System.out.println("TV volume is decreasing to: " + volume);
        } else {
            System.out.println("Action can't be performed");
        }
    }
}
