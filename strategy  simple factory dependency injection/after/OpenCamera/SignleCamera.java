package after.OpenCamera;

public class SignleCamera implements ICanOpenCameraStrategy{
    @Override
    public void openCamera() {
        System.out.println("Open Face Camera");
    }

}
