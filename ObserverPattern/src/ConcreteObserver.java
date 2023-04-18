public class ConcreteObserver implements  IObserver{
    IObservable observable;
    String name;
    ConcreteObserver(IObservable observable,String name){
        this.observable=observable;
        this.name=name;
    }
    @Override
    public void update() {
        System.out.println("observer "+ this.name +" got "+ this.getObservableState()+ " from "+ this.observable.getName());

    }

    @Override
    public int getObservableState() {
        return this.observable.getState();
    }

    @Override
    public void setObservableState(int state) {
        this.observable.setState(state);

    }
}
