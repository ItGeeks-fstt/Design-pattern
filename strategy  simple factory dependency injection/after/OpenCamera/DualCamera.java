package after.OpenCamera;

public class DualCamera implements ICanOpenCameraStrategy{
    @Override
    public void openCamera() {
        System.out.println("Open Dual Camera");
    }
}
