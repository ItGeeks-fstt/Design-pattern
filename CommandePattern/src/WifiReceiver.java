public class WifiReceiver {
    //    single responsibility principle (SRP)
//    the wifi receiver should only be responsible for turning on and off the wifi and nothing else
    public void on() {
//        some code to turn on the wifi
        System.out.println("Wifi is on");
    }

    public void off() {
//        some code to turn off the wifi
        System.out.println("Wifi is off");
    }
}
//receiver