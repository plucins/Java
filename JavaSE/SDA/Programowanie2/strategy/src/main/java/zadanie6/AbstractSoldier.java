package zadanie6;

public abstract class AbstractSoldier {
    private double experiencePoints;
    private double healthPoints = 1000.0;
    private double bowDefanceLevel;
    private double fistDefanceLevel;
    private double magicDefanceLevel;

    public boolean fight(AbstractSoldier soldier) {
        double hit = (this.experiencePoints / 10) - (soldier.getSoldierPower() * 2.0 * 50);
        if(hit < 0 ) hit = 5;

        return this.healthPoints - hit < 0;
    }


    public abstract int getSoldierPower();
}
