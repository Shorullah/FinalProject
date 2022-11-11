package company;

public class DisplayObservers implements IObserver{

    private int observerID;

    public DisplayObservers(int observerID) {
        this.observerID = observerID;
    }

    @Override
    public void update(double updatedTemperature) {
        System.out.println("Temperature in room  "+ this.observerID + " is: "+updatedTemperature);
    }

}
