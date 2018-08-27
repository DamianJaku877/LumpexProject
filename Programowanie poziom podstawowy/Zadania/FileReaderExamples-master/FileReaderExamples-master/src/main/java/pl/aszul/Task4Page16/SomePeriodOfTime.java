package pl.aszul.Task4Page16;

import lombok.Getter;

public class SomePeriodOfTime {
        @Getter
        private int accumulator = 0;

        public SomePeriodOfTime add(int passengers){
            accumulator += passengers;
            return this;
        }
}