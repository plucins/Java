package systemAndroid.model;


import systemAndroid.EventDispatcher;

public abstract class AbstractRegistrable {
    public AbstractRegistrable() {
        EventDispatcher.getInstance().register(this);
    }
}
