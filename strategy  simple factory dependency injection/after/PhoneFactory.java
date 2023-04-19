package after;

import after.Charge.ICanChargeStrategy;
import after.Charge.MicroUsb;
import after.Charge.TypeC;
import after.MakeCall.CellCall;
import after.MakeCall.ICanMakeCallStrategy;
import after.MakeCall.InternationalCall;
import after.MakeCall.VideoCall;
import after.OpenCamera.ICanOpenCameraStrategy;
import after.OpenCamera.DualCamera;
import after.OpenCamera.SignleCamera;
import after.UnlockScreen.FaceUnlock;
import after.UnlockScreen.FingerprintUnlock;
import after.UnlockScreen.ICanUnlockScreenStrategy;

public class PhoneFactory {
    public Phone makePhone(CallType callType, CameraType cameraType, UnlockType unlockType, ChargeType chargeType) {

        // this place will be like a factory which one place to configure all the phone
        // possibilities
        ICanMakeCallStrategy makeCallStrategy;
        ICanOpenCameraStrategy openCameraStrategy;
        ICanUnlockScreenStrategy unlockScreenStrategy;
        ICanChargeStrategy chargeStrategy;

        switch (callType) {
            case VIDEO:
                makeCallStrategy = new VideoCall();
                break;
            case VOICE:
                makeCallStrategy = new CellCall();
                break;
            case International:
                makeCallStrategy = new InternationalCall();
                break;
            default:
                throw new RuntimeException("Invalid call type");
        }
        switch (cameraType) {
            case DUAL:
                openCameraStrategy = new DualCamera();
                break;
            case SINGLE:
                openCameraStrategy = new SignleCamera();
                break;
            default:
                throw new RuntimeException("Invalid camera type");
        }
        switch (unlockType) {
            case FACE:
                unlockScreenStrategy = new FaceUnlock();
                break;
            case FINGERPRINT:
                unlockScreenStrategy = new FingerprintUnlock();
                break;
            default:
                throw new RuntimeException("Invalid unlock type");
        }
        switch (chargeType) {
            case C:
                chargeStrategy = new TypeC();
                break;
            case USB_2_MICRO:
                chargeStrategy = new MicroUsb();
                break;
            default:
                throw new RuntimeException("Invalid charge type");
        }

        return new Phone(makeCallStrategy, openCameraStrategy, unlockScreenStrategy, chargeStrategy);
    }
}
