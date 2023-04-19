package after.Charge;

public class TypeC implements ICanChargeStrategy
{
    @Override
    public void charge()
    {
        System.out.println("Charging with Type-C");
    }
}
