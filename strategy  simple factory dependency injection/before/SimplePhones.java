package before;

import before.Phone;

public class SimplePhones extends Phone {
    @Override
    public void makeCall() {
        System.out.println("simple phones can cell calls only");
    }

    @Override
    public void charge() {
        System.out.println("simple phones can charge using their own not universal adapters ");

    }

    @Override
    public void openCamera() {
        System.out.println("simple phones doesn't have a camera ");

    }

    @Override
    public void unlockScreen() {
        System.out.println("simple phones doesn't support unlock screen ");

    }
}
