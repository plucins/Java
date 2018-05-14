package restauracja;

import org.apache.commons.lang3.ClassUtils;
import restauracja.zdarzenia.IEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventDispatcher {
    private static EventDispatcher ourInstance = new EventDispatcher();

    public static EventDispatcher getInstance() {
        return ourInstance;
    }

    private Map<Class<?>, List<Object>> listOfRegisteredObjects = new HashMap<>();
    private ExecutorService executorService = Executors.newSingleThreadExecutor();


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

    public void rozeslij(final IEvent zdarzenie){
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try{
                    zdarzenie.execute();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
