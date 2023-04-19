package after.UnlockScreen;

public class FingerprintUnlock implements ICanUnlockScreenStrategy{
    @Override
    public void unlockScreen() {
        System.out.println("Unlocking screen by biometrics");
    }
}
