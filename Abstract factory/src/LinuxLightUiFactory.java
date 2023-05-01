import Button.IButton;
import Button.LinuxLightButton;
import Input.IInput;
import Input.LinuxLightInput;

public class LinuxLightUiFactory implements IUiFactory{

    @Override
    public IButton createButton() {
        return new LinuxLightButton();
    }

    @Override
    public IInput createInput() {
        return new LinuxLightInput();
    }
}
// we can create a LinuxLightUiFactory and use it to create a button and input,
//we will have to create all possible combinations of buttons and inputs types
//for each OS and theme
//we can make it event button with inversion of control(IOC) and dependency injection(DI)
//and it will be similar to the strategy pattern