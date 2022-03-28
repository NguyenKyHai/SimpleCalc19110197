package com.android.calculator_19110197;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)

public class Calculator_19110197 {

    private Calculator mCalculator;
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    //ADD
    @Test
    public void addTwoNums() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumsNeg() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test
    public void addTwoNumsWorksWithNegResult() {
        double resultAdd = mCalculator.add(-1d, -2d);
        assertThat(resultAdd, is(equalTo(-3d)));
    }

    @Test
    public void addTwoNumsFloats() {
        double resultAdd = mCalculator.add(2.222d, 1.111d);
        assertThat(resultAdd, is(equalTo(3.333)));
    }

    @Test
    public void addTwoNumsBigums() {
        double resultAdd = mCalculator.add(123456789d, 111111111d);
        assertThat(resultAdd, is(equalTo(234567900d)));
    }

    //SUB
    @Test
    public void subTwoNums() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }
    @Test
    public void subWorksWithNegResult() {
        double resultSub = mCalculator.sub(1d, 3d);
        assertThat(resultSub, is(equalTo(-2d)));
    }

    @Test
    public void subTwoNumsNeg() {
        double resultSub = mCalculator.sub(-1d, -4d);
        assertThat(resultSub, is(equalTo(3d)));
    }
    @Test
    public void subTwoNumsFloats() {
        double resultSub = mCalculator.sub(2.222d, 1.111d);
        assertThat(resultSub, is(equalTo(1.111d)));
    }
    @Test
    public void subTwoNumsBignums() {
        double resultSub = mCalculator.sub(234567892d, 111111111d);
        assertThat(resultSub, is(equalTo(123456781d)));
    }
    //MUL
    @Test
    public void mulTwoNums() {
        double resultMul = mCalculator.mul(2d, 2d);
        assertThat(resultMul, is(equalTo(4d)));
    }
    @Test
    public void mulTwoNumsZero() {
        double resultMul = mCalculator.mul(2d, 0d);
        assertThat(resultMul, is(equalTo(0d)));
    }
    @Test
    public void mulTwoNumsNeg() {
        double resultMul = mCalculator.mul(-2d, -1d);
        assertThat(resultMul, is(equalTo(2d)));
    }
    @Test
    public void mulWorksWithNegResult() {
        double resultMul = mCalculator.mul(-2d, 1d);
        assertThat(resultMul, is(equalTo(-2d)));
    }
    @Test
    public void mulTwoNumsNegAndZero() {
        double resultMul = mCalculator.mul(-2d, 0d);
        assertThat(resultMul, is(equalTo(-0d)));
    }
    @Test
    public void mulTwoNumsFloats() {
        double resultMul = mCalculator.mul(0.5d, 0.5d);
        assertThat(resultMul, is(equalTo(0.25d)));
    }
    //DIV
    @Test
    public void divTwoNums() {
        double resultDiv = mCalculator.div(4d, 2d);
        assertThat(resultDiv, is(equalTo(2d)));
    }
    @Test
    public void divTwoNumsZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }
    @Test
    public void divTwoNumsNeg() {
        double resultDiv = mCalculator.div(-4d, -2d);
        assertThat(resultDiv, is(equalTo(2d)));
    }
    @Test
    public void divWorksWithNegResult() {
        double resultDiv = mCalculator.div(-4d, 2d);
        assertThat(resultDiv, is(equalTo(-2d)));
    }
    @Test
    public void divTwoNumsBignums() {
        double resultDiv = mCalculator.div(999999999d, 333333333d);
        assertThat(resultDiv, is(equalTo(3d)));
    }
    @Test
    public void divTwoNumsFloats() {
        double resultDiv = mCalculator.div(0.25d, 0.5d);
        assertThat(resultDiv, is(equalTo(0.5d)));
    }
    //POW
    @Test
    public void powTwoNums() {
        double resultPow = mCalculator.pow(2d, 3d);
        assertThat(resultPow, is(equalTo(8d)));
    }
    @Test
    public void powTwoNumbersNegative() {
        double resultPow = mCalculator.pow(2d, -2d);
        assertThat(resultPow, is(equalTo(0.25d)));
    }
    @Test
    public void powTwoNumsFloats() {
        double resultPow = mCalculator.pow(0.25d, 0.5d);
        assertThat(resultPow, is(equalTo(0.5d)));
    }
    @Test
    public void powWorksWithNegResult() {
        double resultPow = mCalculator.pow(-2d, 3d);
        assertThat(resultPow, is(equalTo(-8d)));
    }
    @Test
    public void powTwoNumsBignums() {
        double resultPow = mCalculator.pow(999999999d, 333333333d);
        assertThat(resultPow, is(equalTo(Double.POSITIVE_INFINITY)));
    }
    //FACT
    @Test
    public void factNum() {
        double resultFact = mCalculator.fact(3d);
        assertThat(resultFact, is(equalTo(6d)));
    }
    @Test
    public void factNumNeg() {
        double resultFact = mCalculator.fact(-3d);
        assertThat(resultFact, is(equalTo(0d)));
    }
    @Test
    public void factNumFloat() {
        double resultFact = mCalculator.fact(0.5d);
        assertThat(resultFact, is(equalTo(0d)));
    }
    @Test
    public void factBignum() {
        double resultFact = mCalculator.fact(34d);
        assertThat(resultFact, is(equalTo(0d)));
    }
    @Test
    public void factWithZero() {
        double resultFact = mCalculator.fact(0d);
        assertThat(resultFact, is(equalTo(1d)));
    }
    //LOG
    @Test
    public void logTwoNums() {
        double resultLog = mCalculator.log(2d, 4d);
        assertThat(resultLog, is(equalTo(2d)));
    }
    @Test
    public void logTwoNumsNeg() {
        double resultLog = mCalculator.log(2d, -3d);
        assertThat(resultLog, is(equalTo(Double.NaN)));
    }
    @Test
    public void logTwoNumsFloats() {
        double resultLog = mCalculator.log(0.25d, 0.5d);
        assertThat(resultLog, is(equalTo(0.5d)));
    }
    @Test
    public void logTwoNumsBaseE() {
        double resultLog = mCalculator.log(Math.E, 1d);
        assertThat(resultLog, is(equalTo(0d)));
    }
}