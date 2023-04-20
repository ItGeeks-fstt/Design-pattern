import java.util.UUID;

public class Main {
    public static void main(String[] args) {

//        example of a remote control  and a smart home
//         the commands will be the light on and off
//       turn on the ac and turn off the ac

//        the remote control will be the invoker
//        the light and ac will be the receiver

//        the invoker should be able to execute the command without knowing the receiver details


//        the remote control (the invoker)
        RemoteControl remoteControl = new RemoteControl();
//        the light receiver device
        LightReceiver lightReceiver = new LightReceiver();
        LightReceiver lightReceiver2 = new LightReceiver();
//        the ac receiver device
        AcReceiver acReceiver = new AcReceiver();
//        the WI-FI receiver device
        WifiReceiver wifiReceiver = new WifiReceiver();
        // the commands to control the light receiver

        ICommand lightReceiverCommand = new LightReceiverCommand(lightReceiver);
        ICommand acReceiverCommand = new AcReceiverCommand(acReceiver);
        ICommand wifiReceiverCommand = new WifiReceiverCommand(wifiReceiver);

        ICommand lightReceiverCommand2 = new LightReceiverCommand(lightReceiver2);
        ICommand acReceiverTempCommand = new AcReceiverTempCommand(acReceiver);


        remoteControl.setCommand(0, lightReceiverCommand);
        remoteControl.setCommand(1, acReceiverCommand);
        remoteControl.setCommand(2, acReceiverTempCommand);
        remoteControl.setCommand(4, wifiReceiverCommand);
        remoteControl.setCommand(3, lightReceiverCommand2);
        // the rest of the slots are empty
//        remoteControl.onButtonWasPushed(1);// turn on the ac
//        remoteControl.offButtonWasPushed(1);// turn off the ac
//        remoteControl.onButtonWasPushed(0);// turn on the light
//        remoteControl.offButtonWasPushed(0);// turn off the light
//        remoteControl.onButtonWasPushed(2);// increase the ac temperature
//        remoteControl.offButtonWasPushed(2);// decrease the ac temperature
//batch commands
        remoteControl.onButtonWasPushed(0).offButtonWasPushed(1).onButtonWasPushed(2).offButtonWasPushed(3).onButtonWasPushed(4);
// an empty slot
        remoteControl.onButtonWasPushed(5);// no command(Null Object Pattern)
//        another control of type smartPhone that can manage the same receivers with the same commands

        SmartPhoneControl smarthPhoneControl = new SmartPhoneControl();
        UUID lightReceiverId = smarthPhoneControl.addButton(lightReceiverCommand);
        UUID acReceiverId = smarthPhoneControl.addButton(acReceiverCommand);
        UUID acTempReceiverId = smarthPhoneControl.addButton(acReceiverTempCommand);
        UUID wifiReceiverId = smarthPhoneControl.addButton(wifiReceiverCommand);
        UUID ac2ReceiverId = smarthPhoneControl.addButton(lightReceiverCommand2);
        smarthPhoneControl.onButtonWasPushed(lightReceiverId).offButtonWasPushed(acReceiverId).onButtonWasPushed(acTempReceiverId).offButtonWasPushed(wifiReceiverId).onButtonWasPushed(ac2ReceiverId);
        smarthPhoneControl.onButtonWasPushed(UUID.randomUUID());

//        => the invoker doesn't has the same interface but we make them work the same commandes
//         invokers doesn't have an interface because any invoker behaves differently


    }
}