package company;

public class TurnTVUp implements ICommand{
    ElectronicDevice theDevice;
    public TurnTVUp(ElectronicDevice theDevice){
        this.theDevice = theDevice;
    }
    @Override
    public void execute() {
        theDevice.turnUp();
    }

    @Override
    public void unExecute() {
        theDevice.turnDown();
    }
}
