package before;

import before.Phone;

public class SmartPhone extends Phone {
    @Override
    public void makeCall() {
        System.out.println("smart phones can make video and voice call");
    }

    @Override
    public void charge() {
        System.out.println("smart phones can charge using type c or type usb 2");
    }

    @Override
    public  void openCamera() {
        System.out.println("smart phones can  have face and back camera");
    }

    @Override
    public  void unlockScreen() {
        System.out.println("smart phones can unlock screen using face camera or biometric or using a pattern ");
    }

}
