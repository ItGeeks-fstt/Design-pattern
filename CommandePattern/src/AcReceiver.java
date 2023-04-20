public class AcReceiver {
    //    single responsibility principle (SRP)
//    the ac receiver should only be responsible for turning on and off the ac and nothing else
    public void on() {
//        some code to turn on the ac
        System.out.println("Ac is on");
    }

    public void off() {
//        some code to turn off the ac
        System.out.println("Ac is off");
    }

    public void increaseTemp() {
//        some code to increase the temperature
        System.out.println("Ac temperature is increased");
    }

    public void decreaseTemp() {
//        some code to decrease the temperature
        System.out.println("Ac temperature is decreased");
    }
}
