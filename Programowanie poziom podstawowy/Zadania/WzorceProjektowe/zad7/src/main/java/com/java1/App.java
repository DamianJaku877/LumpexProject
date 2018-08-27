package com.java1;

import java.math.BigDecimal;

public class App
{
    public static void main( String[] args )
    {
        TaxContex ctx = new TaxContex();
        ctx.setTaxStrategy(new TaxPL());
        System.out.println(ctx.getTax(BigDecimal.valueOf(100)));
    }
}
