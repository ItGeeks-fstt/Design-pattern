package after;

import after.Charge.ICanChargeStrategy;
import after.MakeCall.ICanMakeCallStrategy;
import after.OpenCamera.ICanOpenCameraStrategy;
import after.UnlockScreen.ICanUnlockScreenStrategy;

abstract public class AbstractPhone implements ICanMakeCallStrategy, ICanChargeStrategy, ICanOpenCameraStrategy, ICanUnlockScreenStrategy {
//    public  abstract void makeCall();
//    public  abstract void charge();
//    public  abstract void openCamera();
//    public  abstract void unlockScreen();
}

