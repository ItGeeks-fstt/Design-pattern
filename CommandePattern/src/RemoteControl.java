public class RemoteControl {
    //    this the invoker class
//    the remote control has 7 slots
//all available slots are :
    // 1. Toggle(On Off)
    // 2. Toggle(On Off)
    // 3. Toggle(On Off)
    // 4. Toggle(On Off)
    // 5. Toggle(On Off)
    // 6. Toggle(On Off)
    // 7. Toggle(On Off)
    final private ICommand[] commands = new ICommand[7];


    public RemoteControl() {
        for (int i = 0; i < 7; i++) {
            //            because the commands are not initialized
            commands[i] = new NoCommand();

//            do nothing

        }
    }

    public void setCommand(int slot, ICommand onCommand) {
        commands[slot] = onCommand;
    }

    public RemoteControl onButtonWasPushed(int slot) {
        commands[slot].execute();
        return this;
    }

    public RemoteControl offButtonWasPushed(int slot) {
        commands[slot].unexecute();
        return this;
    }



}