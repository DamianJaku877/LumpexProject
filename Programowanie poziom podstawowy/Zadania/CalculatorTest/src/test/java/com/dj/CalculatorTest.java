package com.dj;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;


@RunWith(JUnitParamsRunner.class)

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setCalculator(){
        calculator = new Calculator();
    }

    @Test
    @Parameters({"3.5,5", "8, -5", "2, 0", "12,6"})
    public void testAdding(double a, double b) throws Exception{
        calculator = new Calculator();
        Double resultAdd = calculator.add(a,b);
        Double expectedAdd = a+b;
        assertEquals(expectedAdd,resultAdd);
    }
    @Test
    @Parameters({"3.5,5", "8, -5", "2,0", "12,6"})
    public void testSubtract(double a, double b) throws Exception{
        calculator = new Calculator();
        Double resultSubtract = calculator.subtract(a,b);
        Double expectedSubtract = a-b;
        assertEquals(expectedSubtract, resultSubtract);
    }
    @Test
    @Parameters({"3.5,5", "8, -5", "2,0", "12,6"})
    public void testMultiply(double a, double b) throws Exception{
        calculator = new Calculator();
        Double resultMultiply = calculator.multiply(a,b);
        Double expectedMultiply = a*b;
        assertEquals(expectedMultiply, resultMultiply);
    }
    @Test
    @Parameters({"3,5", "8,5", "2,0", "12,6"})
    public void testDivide(double a, double b){
        Double result = null;
        try
        {
            result = calculator.divide(a,b);
        }
        catch (ArithmeticException exception)
        {
            assertNull(result);
            assertEquals(exception.getMessage(), "Incorrect value");
        }
    }
    @Test
    public void isNumberEvenTest(){
        assertTrue(calculator.isNumberEven(8));
    }
    @Test
    @Parameters({"3.8,5", "8,5", "2,0", "12,6"})
    public void numberPowerTest(double a,double b) throws Exception{
        calculator = new Calculator();
        double resultPower = calculator.numberPower(a,b);
        double expectedPower = Math.pow(a,b);
        assertEquals(expectedPower,resultPower,0);
    }
    @Test
    @Parameters({"4000","3000","5000","6000"})
    public void vatTest(double netto)throws Exception {
        calculator = new Calculator();
        double resultVat = calculator.calculationVat(netto);
        double expectedVat = netto * 0.19;
        assertEquals(expectedVat,resultVat,1);
    }
    @Test
    @Parameters({"3000,23","3000,19"})
    public void bruttoOnNetto(double netto, double vat) throws Exception{
        calculator = new Calculator();
        double resultBruttoOnNetto = calculator.bruttoOnNetto(netto,vat);
        double expectedBruttoOnNetto = (netto * (vat / 100)) + netto;
        assertEquals(expectedBruttoOnNetto,resultBruttoOnNetto,0);
    }

}