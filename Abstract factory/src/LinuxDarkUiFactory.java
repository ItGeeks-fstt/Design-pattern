import Button.IButton;
import Button.LinuxDarkButton;
import Input.IInput;
import Input.LinuxDarkInput;

public class LinuxDarkUiFactory implements IUiFactory{

    @Override
    public IButton createButton() {
        return new LinuxDarkButton();
    }

    @Override
    public IInput createInput() {
        return new LinuxDarkInput();
    }
}
// we can create a LinuxDarkUiFactory and use it to create a button and input,
//we will have to create all possible combinations of buttons and inputs types
//for each OS and theme
//we can make it event button with inversion of control(IOC) and dependency injection(DI)
//and it will be similar to the strategy pattern