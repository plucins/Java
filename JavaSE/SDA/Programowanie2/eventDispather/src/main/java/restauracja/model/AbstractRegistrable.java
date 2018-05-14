package restauracja.model;

import ztm.EventDispatcher;

public abstract class AbstractRegistrable {
    public AbstractRegistrable() {
        EventDispatcher.getInstance().register(this);
    }
}
