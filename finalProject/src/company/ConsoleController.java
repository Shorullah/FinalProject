package company;

import java.util.ArrayList;

public class ConsoleController implements IObservable{
    private ArrayList<IObserver> observers;
    private double temperature;

    public ConsoleController (){

        observers = new ArrayList<IObserver>();
    }

    @Override
    public void register(IObserver newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(IObserver deleteObserver) {
        int observerIndex =  observers.indexOf(deleteObserver);
        observerIndex+=1;
        System.out.println("Room air conditioner"+ observerIndex + " is not responding");
        observers.remove(deleteObserver);
    }

    @Override
    public void notifyObserver() {
        for(IObserver observer : observers){
            observer.update(temperature);
        }

    }

    public void setTemperature(double newTemperature) {
        this.temperature = newTemperature;
        notifyObserver();
    }

}
