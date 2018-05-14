package ztm;

import org.apache.commons.lang3.ClassUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventDispatcher {
    private static EventDispatcher ourInstance = new EventDispatcher();

    public static EventDispatcher getInstance() {
        return ourInstance;
    }

    private Map<Class<?>, List<Object>> listOfRegisteredObjects = new HashMap<>();

    private EventDispatcher() {
    }

    public void register(Object o){
        List<Class<?>> interfejsyImplementowaePrzezO  = ClassUtils.getAllInterfaces(o.getClass());

        for(Class<?> klasa: interfejsyImplementowaePrzezO){
            List<Object> objects;
            if(listOfRegisteredObjects.containsKey(klasa)){
                objects = listOfRegisteredObjects.get(klasa);
            }else {
                objects = new ArrayList<>();
            }
            objects.add(o);
            listOfRegisteredObjects.put(klasa,objects);
        }
    }

    public <T>List<T> pobierzObiektyImplementujaceInterface(Class<?> interfejs){
        return (List<T>) listOfRegisteredObjects.get(interfejs);
    }
}
