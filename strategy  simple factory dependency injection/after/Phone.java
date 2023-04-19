package after;

import after.Charge.ICanChargeStrategy;
import after.MakeCall.ICanMakeCallStrategy;
import after.OpenCamera.ICanOpenCameraStrategy;
import after.UnlockScreen.ICanUnlockScreenStrategy;

public class Phone extends AbstractPhone {
    ICanOpenCameraStrategy openCameraStrategy;
    ICanUnlockScreenStrategy unlockScreenStrategy;
    ICanMakeCallStrategy makeCallStrategy;
    ICanChargeStrategy chargeStrategy;

    public Phone(ICanMakeCallStrategy makeCallStrategy, ICanOpenCameraStrategy openCameraStrategy, ICanUnlockScreenStrategy unlockScreenStrategy, ICanChargeStrategy chargeStrategy) {
        this.makeCallStrategy = makeCallStrategy;
        this.openCameraStrategy = openCameraStrategy;
        this.unlockScreenStrategy = unlockScreenStrategy;
        this.chargeStrategy = chargeStrategy;
    }

    @Override
    public void charge() {
        this.chargeStrategy.charge();
    }

    @Override
    public void makeCall() {
        this.makeCallStrategy.makeCall();
    }

    @Override
    public void openCamera() {
        this.openCameraStrategy.openCamera();
    }

    @Override
    public void unlockScreen() {
        this.unlockScreenStrategy.unlockScreen();
    }
}
