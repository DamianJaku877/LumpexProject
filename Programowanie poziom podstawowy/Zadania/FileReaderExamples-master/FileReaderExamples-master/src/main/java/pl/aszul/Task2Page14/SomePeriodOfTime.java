package pl.aszul.Task2Page14;

public class SomePeriodOfTime {
        private int accumulator = 0;
        private int counter = 1;

        public SomePeriodOfTime add(int avgTemperature){
            accumulator += avgTemperature;
            counter++;
            return this;
        }

        public int avgTemperature() {
            return accumulator / counter;
        }
}