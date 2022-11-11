package company;

public class DeviceButton {
    ICommand command;
    public DeviceButton(ICommand command){
        this.command = command;
    }
    public void press(){
        this.command.execute();
    }
    public void pressUndo(){
        this.command.unExecute();
    }}
