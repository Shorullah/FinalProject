package company;

public class TurnTVOn implements ICommand{

    ElectronicDevice theDevice;
    public TurnTVOn(ElectronicDevice theDevice){
        this.theDevice = theDevice;
    }
    @Override
    public void execute() {
        theDevice.turnOn();
    }

    @Override
    public void unExecute() {
        theDevice.turnOff();
    }
}
