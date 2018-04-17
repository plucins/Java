package pl.anicos.patterns.exercises.adapter.de;

public class GermanPlugConnectorImpl implements GermanPlugConnector {
    @Override
    public void giveElectricity() {
        System.out.println("German plug connected");
    }
}
