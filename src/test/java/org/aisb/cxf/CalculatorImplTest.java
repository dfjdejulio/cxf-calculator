
package org.aisb.cxf;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorImplTest {

    @Test
    public void testAdd() {
        CalculatorImpl calculatorImpl = new CalculatorImpl();
        double response = calculatorImpl.add(2, 2);
        assertEquals(4, response, 0.001);
    }
}
