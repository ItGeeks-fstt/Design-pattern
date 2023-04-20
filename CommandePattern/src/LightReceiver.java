public class LightReceiver {
    private boolean isOn = false;

    //    single responsibility principle (SRP)
//    the light receiver should only be responsible for turning on and off the light and nothing else
//   imagine that the light can be turned on and off by a remote control or a switch or a button
    public void on() {
//        some code to turn on the light
        if (isOn) {
            System.out.println("Light is already on");
            return;
        } else {
            System.out.println("Light is on");
            isOn = true;
        }
    }

    public void off() {
//        some code to turn off the light
        if(!isOn) {
            System.out.println("Light is already off");
            return;
        } else {
            System.out.println("Light is off");
            isOn = false;
        }

    }
    public void toggle() {
        if(isOn) {
            off();
        } else {
            on();
        }
    }
}
