import Button.IButton;
import Button.WindowsLightButton;
import Input.IInput;
import Input.WindowsLightInput;

public class WindowsLightUiFactory implements IUiFactory{

    @Override
    public IButton createButton() {
        return new WindowsLightButton();
    }

    @Override
    public IInput createInput() {
        return new WindowsLightInput();
    }
}
// we can create a WindowsLightUiFactory and use it to create a button and input,
//we will have to create all possible combinations of buttons and inputs types
//for each OS and theme
//we can make it event button with inversion of control(IOC) and dependency injection(DI)
//and it will be similar to the strategy pattern