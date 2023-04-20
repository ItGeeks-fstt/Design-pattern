public class AcReceiverCommand implements ICommand{
    private final AcReceiver acReceiver;

    AcReceiverCommand(AcReceiver acReceiver) {
        this.acReceiver = acReceiver;
    }

    @Override
    public void execute() {
        this.acReceiver.on();
    }

    @Override
    public void unexecute() {
        this.acReceiver.off();
    }
}
