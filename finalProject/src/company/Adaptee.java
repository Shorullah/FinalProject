package company;

public class Adaptee {

    // Command patter to adjust TV of your house
    public void tvSpecificRequest(){
        ElectronicDevice newDevice = TvRemote.getDevice();
        //-------------------------Turn ON TV----------------------------

        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        //-------------------------Turn Volume UP-----------------------

        TurnTVUp volUpCommand = new TurnTVUp(newDevice);
        DeviceButton upPressed = new DeviceButton(volUpCommand);
        upPressed.press();
        upPressed.press();
        upPressed.press();
        //------------------------Turn Volume Down----------------------
        TurnTVUp volDownCommand = new TurnTVUp(newDevice);
        DeviceButton downPressed = new DeviceButton(volDownCommand);
        downPressed.pressUndo();
        downPressed.pressUndo();
        //-------------------------Turn OFF TV-----------------------------
        TurnTVOn offCommand = new TurnTVOn(newDevice);
        DeviceButton offPressed = new DeviceButton(offCommand);
        offPressed.pressUndo();
    }
    // using observer pattern update airConditioning system of the house
    public void tempRequest(){
        ConsoleController weatherStation = new ConsoleController();
        DisplayObservers observer1 = new DisplayObservers(1);
        weatherStation.register(observer1);
        DisplayObservers observer2 = new DisplayObservers(2);
        weatherStation.register(observer2);
        DisplayObservers observer3 = new DisplayObservers(3);
        weatherStation.register(observer3);
        weatherStation.setTemperature(18);
        weatherStation.unregister(observer1);
        weatherStation.setTemperature(-1);
    }
}
