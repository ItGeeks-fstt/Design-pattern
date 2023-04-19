package after.UnlockScreen;

public class FaceUnlock implements ICanUnlockScreenStrategy{
    @Override
    public void unlockScreen() {
        System.out.println("Unlocking screen by face");
    }
}
