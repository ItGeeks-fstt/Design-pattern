package after.MakeCall;

public class VideoCall implements ICanMakeCallStrategy
{
    @Override
    public void makeCall()
    {
        System.out.println("Making a call with a video call");
    }

}
