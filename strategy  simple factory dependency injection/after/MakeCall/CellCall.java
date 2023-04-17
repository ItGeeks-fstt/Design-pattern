package after.MakeCall;

public class CellCall implements ICanMakeCallStrategy
{
    @Override
    public void makeCall()
    {
        System.out.println("Making a call with a cell phone");
    }
}
