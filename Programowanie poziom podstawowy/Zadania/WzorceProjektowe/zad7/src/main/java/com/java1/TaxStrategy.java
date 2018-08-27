package com.java1;

import java.math.BigDecimal;

public interface TaxStrategy {

    BigDecimal calculate(BigDecimal value);
}
