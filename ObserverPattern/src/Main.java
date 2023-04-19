public class Main {
//    full duplex connection
    public static void main(String[] args) {
IObservable observable=new ConcreteObservable("main observable ");
IObserver observerOne=new ConcreteObserver(observable,"a");
IObserver observerTwo=new ConcreteObserver(observable,"b");
IObserver observerTree=new ConcreteObserver(observable,"c");
observable.addObserver(observerOne);
observable.addObserver(observerTwo);
observable.addObserver(observerTree);
observerOne.setObservableState(292);// broadcast (subscriber to subscribers...)
//observable.setState(22); // Publisher to subscriber
//observable.setState(23);
//observable.setState(21);
//observable.notifyObservers();
    }
}