package Builder.zadanie2;

public class Stamp {
    private int firstDayNumber = 0;
    private int secondDayNumber = 0;
    private int firstMonthNumber = 0;
    private int secondMonthNumber = 0;
    private int yearNumber1 = 0;
    private int yearNumber2 = 0;
    private int yearNumber3 = 0;
    private int yearNumber4 = 0;
    private int caseNumber = 0;

    public Stamp(Builder builder) {
        this.firstDayNumber = firstDayNumber;
        this.secondDayNumber = secondDayNumber;
        this.firstMonthNumber = firstMonthNumber;
        this.secondMonthNumber = secondMonthNumber;
        this.yearNumber1 = yearNumber1;
        this.yearNumber2 = yearNumber2;
        this.yearNumber3 = yearNumber3;
        this.yearNumber4 = yearNumber4;
        this.caseNumber = caseNumber;
    }

    public static class Builder {
        private int firstDayNumber;
        private int secondDayNumber;
        private int firstMonthNumber;
        private int secondMonthNumber;
        private int yearNumber1;
        private int yearNumber2;
        private int yearNumber3;
        private int yearNumber4;
        private int caseNumber;

        public Builder(int firstDayNumber, int secondDayNumber, int firstMonthNumber, int secondMonthNumber, int yearNumber1, int yearNumber2, int yearNumber3, int yearNumber4, int caseNumber) {
            this.firstDayNumber = firstDayNumber;
            this.secondDayNumber = secondDayNumber;
            this.firstMonthNumber = firstMonthNumber;
            this.secondMonthNumber = secondMonthNumber;
            this.yearNumber1 = yearNumber1;
            this.yearNumber2 = yearNumber2;
            this.yearNumber3 = yearNumber3;
            this.yearNumber4 = yearNumber4;
            this.caseNumber = caseNumber;
        }

        public Stamp build(){
            return new Stamp(this);
        }

    }

}
