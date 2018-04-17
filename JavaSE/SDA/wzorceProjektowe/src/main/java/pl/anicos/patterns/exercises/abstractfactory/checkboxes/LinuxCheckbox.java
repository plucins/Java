package pl.anicos.patterns.exercises.abstractfactory.checkboxes;

import pl.anicos.patterns.exercises.abstractfactory.checkboxes.Checkbox;


public class LinuxCheckbox implements Checkbox {
    public static String YOU_HAVE_CREATED_LINUX_CHECKBOX = "Linux Checkbox";

    @Override
    public String paint() {
        return YOU_HAVE_CREATED_LINUX_CHECKBOX;
    }
}
