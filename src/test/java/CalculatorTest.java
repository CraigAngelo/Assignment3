import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator cal;
    private final Calculator cal1 = new Calculator();

    @Before
    public void init(){

    }

    @Test
    public void add() {

        int a;
        a= 10;
        int b;
        b= 20;
        Calculator cal = new Calculator();
        assertEquals(30, cal.add(a,b));
    }


    @Test
    public void sub() {

        int a;
        a= 10;
        int b;
        b= 20;
        Calculator cal1 = new Calculator();
        assertEquals(-10,cal1.sub(a,b));
    }


}