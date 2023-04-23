import Button.IButton;
import Button.LinuxDarkButton;
import Button.WindowsDarkButton;
import Button.WindowsLightButton;
import Input.IInput;
import Input.WindowsDarkInput;
import Input.WindowsLightInput;

public class Main {
    public static void main(String[] args) {

//        without the abstract factory pattern
        String theme = "dark";
        String os = "windows";
        IButton button;
        IInput input;
        switch (theme) {
            case "dark":
                switch (os) {
                    case "windows":
                        button = new WindowsDarkButton();
                        input = new WindowsDarkInput();
                        break;
                    case "linux":
                        button = new LinuxDarkButton();
                        input = new Input.LinuxDarkInput();
                        break;
                    default:
                        throw new RuntimeException("os not supported");
                }
                break;
            case "light":
                switch (os) {
                    case "windows":
                        button = new WindowsLightButton();
                        input = new WindowsLightInput();
                        break;
                    case "linux":
                        button = new Button.LinuxLightButton();
                        input = new Input.LinuxLightInput();
                        break;
                    default:
                        throw new RuntimeException("os not supported");

                }
                break;
            default:
                throw new RuntimeException("theme not supported");

        }

//  you see we got a lot of spaghetti code with a lot of if else or switch statements and it will be hard to maintain and extend
        button.draw();
        input.draw();
//        after applying the abstract factory
        IUiFactory uiFactory = new LinuxDarkUiFactory();
        button = uiFactory.createButton();
        input = uiFactory.createInput();
        button.draw();
        input.draw();
        IUiFactory uiFactory1 = new LinuxLightUiFactory();
        button = uiFactory1.createButton();
        input = uiFactory1.createInput();
        button.draw();
        input.draw();


    }
}