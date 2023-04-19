public  interface IObserver {
    IObservable observable=null;
    void update();
    int getObservableState();
    void setObservableState(int state);
}
