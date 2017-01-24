package test.java;

import main.java.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {


    @Test
    public void testReturnOneAsString() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.getResult(1));

    }

    @Test
    public void testReturnTwoAsString() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("2", fb.getResult(2));

    }

    @Test
    public void testReturnFizzWhenIsThree() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.getResult(3));

    }


    @Test
    public void testReturnFizzWhenDivisibleByThree() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.getResult(6));
        assertEquals("Fizz", fb.getResult(9));

    }

    @Test
    public void testReturnFizzWhenIsFive() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.getResult(5));
    }

    @Test
    public void testReturnFizzWhenDivisibleByFive() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.getResult(10));
        assertEquals("Buzz", fb.getResult(20));

    }


    @Test
    public void testReturnFizzBuzzWhenIsFifteen() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.getResult(15));
    }


    @Test
    public void testReturnFizzWhenDivisibleByFifteen() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.getResult(30));
        assertEquals("FizzBuzz", fb.getResult(45));
        assertEquals("FizzBuzz", fb.getResult(60));



    }

}
