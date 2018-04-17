package pl.anicos.patterns.exercises.abstractfactory.factories;

import pl.anicos.patterns.exercises.abstractfactory.buttons.Button;
import pl.anicos.patterns.exercises.abstractfactory.buttons.LinuxButton;
import pl.anicos.patterns.exercises.abstractfactory.checkboxes.Checkbox;
import pl.anicos.patterns.exercises.abstractfactory.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
