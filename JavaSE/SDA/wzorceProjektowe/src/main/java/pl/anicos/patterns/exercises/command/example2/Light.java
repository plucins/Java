package pl.anicos.patterns.exercises.command.example2;

//Receiver
public class Light {
    private boolean on;

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }
}
