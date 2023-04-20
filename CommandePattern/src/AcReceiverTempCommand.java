public class AcReceiverTempCommand implements ICommand {
    private final AcReceiver acReceiver;

    AcReceiverTempCommand(AcReceiver acReceiver) {
        this.acReceiver = acReceiver;
    }

    @Override
    public void execute() {
        this.acReceiver.increaseTemp();
    }

    @Override
    public void unexecute() {
        this.acReceiver.decreaseTemp();
    }
}
