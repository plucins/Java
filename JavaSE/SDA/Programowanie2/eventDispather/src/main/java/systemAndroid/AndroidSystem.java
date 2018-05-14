package systemAndroid;

import systemAndroid.model.AbstractRegistrable;
import systemAndroid.model.PhoneApplication;

public class AndroidSystem extends AbstractRegistrable {
    public AndroidSystem() {
        new PhoneApplication();
    }
}
