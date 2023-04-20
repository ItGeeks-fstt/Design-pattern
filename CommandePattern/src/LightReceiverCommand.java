public class LightReceiverCommand implements ICommand {
    final private LightReceiver lightReceiver;

    LightReceiverCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.on();
    }

    @Override
    public void unexecute() {
        this.lightReceiver.off();
    }

}
