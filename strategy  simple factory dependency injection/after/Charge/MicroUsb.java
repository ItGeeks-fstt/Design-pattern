package after.Charge;

public class MicroUsb implements ICanChargeStrategy
{
    @Override
    public void charge()
    {
        System.out.println("Charging with Micro-USB");
    }
}

