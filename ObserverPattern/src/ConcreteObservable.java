import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements  IObservable{


    String name;
    List<IObserver> observers = new ArrayList<IObserver>();
    int state = 0;
    ConcreteObservable(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void setState(int state) {
     //        we can notify all on state change
        this.state=state;
        this.notifyObservers();
    }

    @Override
    public int getState() {
        return this.state;
    }

    @Override
    public void addObserver(IObserver observer) {
this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer:observers) {
            observer.update();
        }

    }
}
