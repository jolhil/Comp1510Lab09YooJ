/**
 * 
 */
package ca.bcit.comp1510.lab09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Jason
 *
 */
class ComplexTest {

    /** 3 + 4 I real part. */
    private static final int TEST1R = 3;

    /** 3 + 4 I imaginary part. */
    private static final int TEST1I = 4;

    /** 1 + I real part. */
    private static final int TEST2R = 1;

    /** 1 + I imaginary part. */
    private static final int TEST2I = 1;
    
    private Complex z1;
    
    private Complex z2;
    
    /**
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
        z1 = new Complex(TEST1R, TEST1I);
        z2 = new Complex(TEST2R, TEST2I);
    }

    @Test
    void testPolarComplex() {
        Complex z3 = z1.reciprocal();
        assertEquals(3.0 + 4.0, z3);
    }
    
    @Test
    void testAdd() {
        Complex z4 = z1.add(z2);
        assertEquals(4.0 + 5.0, z4);
    }

}
