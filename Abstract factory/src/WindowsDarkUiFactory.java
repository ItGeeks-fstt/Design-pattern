import Button.IButton;
import Button.WindowsDarkButton;
import Input.IInput;
import Input.WindowsDarkInput;

public class WindowsDarkUiFactory implements IUiFactory{

    @Override
    public IButton createButton() {
        return new WindowsDarkButton();
    }

    @Override
    public IInput createInput() {
        return new WindowsDarkInput();
    }
}
// we can create a WindowsDarkUiFactory and use it to create a button and input,
//we will have to create all possible combinations of buttons and inputs types
//for each OS and theme
//we can make it event button with inversion of control(IOC) and dependency injection(DI)
//and it will be similar to the strategy pattern