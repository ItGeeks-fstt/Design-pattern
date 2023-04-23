import Button.IButton;
import Input.IInput;

public interface IUiFactory {
     IButton createButton();

     IInput createInput();
}
