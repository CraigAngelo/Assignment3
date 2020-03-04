import org.junit.Test;

import static org.junit.Assert.*;

public class AdvancedCalculatorTest {
    Calculator cal;
    private final Calculator cal1 = new Calculator();

    @Test
    public void mult() {

        int a;
        a =10;
        int b;
        b = 20;
        Calculator cal = new Calculator();
        assertEquals(200, cal.mult(a,b));
    }



}