package pl.anicos.patterns.exercises.abstractfactory.buttons;

import pl.anicos.patterns.exercises.abstractfactory.buttons.Button;

public class LinuxButton implements Button {

    public  static String YOU_HAVE_CREATED_LINUX_BUTTON = "Button Linux";
    @Override
    public String paint() {
        return YOU_HAVE_CREATED_LINUX_BUTTON;
   }
}
