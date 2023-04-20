import java.util.HashMap;
import java.util.UUID;

public class SmartPhoneControl {
    //    the phones doesn't have slots but instead you can add buttons to the screen to do some commands
    HashMap<UUID, ICommand> buttons;
    NoCommand noCommand = new NoCommand();// if the button is not found

    SmartPhoneControl() {
        buttons = new HashMap<>();
    }

    UUID addButton(ICommand command) {
        UUID uuid = UUID.randomUUID();
        buttons.put(uuid, command);
        return uuid;
    }

    void removeButton(UUID buttonId, ICommand command) {
        buttons.remove(buttonId, command);
    }

    SmartPhoneControl onButtonWasPushed(UUID buttonId) {
        if (buttons.containsKey(buttonId)) buttons.get(buttonId).execute();
        else noCommand.execute();
        return this;
    }

    SmartPhoneControl offButtonWasPushed(UUID buttonId) {
        if (buttons.containsKey(buttonId)) buttons.get(buttonId).unexecute();
        else noCommand.unexecute();
        return this;
    }
}

//