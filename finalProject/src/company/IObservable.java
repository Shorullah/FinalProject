package company;

public interface IObservable {
    public void register(IObserver newObserver);
    public void unregister(IObserver deleteObserver);
    public void notifyObserver();

}
