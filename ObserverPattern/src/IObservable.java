

public interface IObservable {

    void setState(int state);
    int getState();
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
    String getName();
}
