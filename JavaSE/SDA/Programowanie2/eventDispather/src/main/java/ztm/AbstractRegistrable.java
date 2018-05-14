package ztm;

public abstract class AbstractRegistrable {
    public AbstractRegistrable() {
        EventDispatcher.getInstance().register(this);
    }
}
