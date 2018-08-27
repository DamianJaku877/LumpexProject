package com.java1;

import java.math.BigDecimal;

public class TaxPL implements TaxStrategy {

    public BigDecimal calculate(BigDecimal value) {
        return value.multiply(BigDecimal.valueOf(0.23));
    }
}
