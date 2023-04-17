package after;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        System.out.println("phone with video call, dual camera, face unlock, type c charge");
        Phone phone = phoneFactory.makePhone(CallType.VIDEO, CameraType.DUAL, UnlockType.FACE, ChargeType.C);
        phone.makeCall();
        phone.openCamera();
        phone.unlockScreen();
        phone.charge();
        System.out.println("phone with voice call, single camera, fingerprint unlock, micro usb charge");
        Phone Anotherphone = phoneFactory.makePhone(CallType.VOICE, CameraType.SINGLE, UnlockType.FINGERPRINT, ChargeType.USB_2_MICRO);
        Anotherphone.makeCall();
        Anotherphone.openCamera();
        Anotherphone.unlockScreen();
        Anotherphone.charge();
//         you see know you can add more options to the phone without changing the code
//         create any type of phone you want with any type of options you want

    }
}
