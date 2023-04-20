public class WifiReceiverCommand implements ICommand{
    private final WifiReceiver wifiReceiver;

    WifiReceiverCommand(WifiReceiver wifiReceiver) {
        this.wifiReceiver = wifiReceiver;
    }

    @Override
    public void execute() {
        this.wifiReceiver.on();
    }

    @Override
    public void unexecute() {
        this.wifiReceiver.off();
    }
}
