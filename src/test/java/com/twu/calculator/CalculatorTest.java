package com.twu.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest{

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void should_return_2_when_1_add_1() throws Exception {
        assertThat(Double.compare(calculator.calculate("1+1"), 2.0), is(0));
    }

    @Test
    public void should_return_3_when_1_add_1_and_1() throws Exception {
        assertThat(Double.compare(calculator.calculate("1+1+1"), 3.0), is(0));
    }

    @Test
    public void should_return_0_when_1_subtract_1() throws Exception {
        assertThat(Double.compare(calculator.calculate("1-1"), 0.0), is(0));

    }

    @Test
    public void should_return_1_when_3_subtract_1_and_1() throws Exception {
        assertThat(Double.compare(calculator.calculate("3-1-1"), 1.0), is(0));

    }

    @Test
    public void should_return_2_when_1_add_2_subtract_1() throws Exception {
        assertThat(Double.compare(calculator.calculate("1+2-1"), 2.0), is(0));

    }

    @Test
    public void should_return_2_when_3_subtract_2_add_1() throws Exception {
        assertThat(Double.compare(calculator.calculate("3-2+1"), 2.0), is(0));

    }

    @Test
    public void should_return_4_when_2_multiply_2() throws Exception {
        assertThat(Double.compare(calculator.calculate("2*2"), 4.0), is(0));
    }

    @Test
    public void should_return_0_when_2_multiply_0() throws Exception {
        assertThat(Double.compare(calculator.calculate("2*0"), 0.0), is(0));
    }

    @Test
    public void should_return_0_when_2_add_3_subtract_5_multiply_2() throws Exception {
        assertThat(Double.compare(calculator.calculate("2+3-5*2"), 0.0), is(0));
    }

    @Test
    public void should_return_1_when_2_divide_1() throws Exception {
        assertThat(Double.compare(calculator.calculate("2/1"), 2.0), is(0));
    }

    @Test
    public void should_return_0_dot_5_when_1_divide_2() throws Exception {
        assertThat(Double.compare(calculator.calculate("1/2"), 0.5), is(0));
    }

    @Test
    public void should_return_2_when_1_add_4_substract_2_multiply_2_divide_3() throws Exception {
        assertThat(Double.compare(calculator.calculate("1+4-2*2/3"), 2.0), is(0));
    }

}
