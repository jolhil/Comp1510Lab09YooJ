/**
 * 
 */
package ca.bcit.comp1510.lab09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test the Complex class.
 * 
 * @author Junsang(Jason) Yoo
 * @version 2021
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
    
    /** The first complex object to test.*/
    private Complex z1;
    
    /** The second complex object to test.*/
    private Complex z2;
    
    /**
     * Creates two complex objects before each test is executed.
     * 
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
        z1 = new Complex(TEST1R, TEST1I);
        z2 = new Complex(TEST2R, TEST2I);
    }

    /**
     * Test Reciprocal method.
     */
    @Test
    void testReciprocal() {
        double denominator = TEST1R * TEST1R + TEST1I * TEST1I;
        Complex z3 = z1.reciprocal();
        Complex answer = new Complex(TEST1R / denominator, 
                -TEST1I / denominator);
        assertEquals(answer, z3);
    }
    
    /**
     * Test add complex object method.
     */
    @Test
    void testAddComplex() {
        Complex z4 = z1.add(z2);
        Complex answer = new Complex(TEST1R + TEST2R, TEST1I + TEST2I);
        assertEquals(answer, z4);
    }
    
    /**
     * Test add double method.
     */
    @Test
    void testAddDouble() {
        double three = 3;
        Complex z4 = z1.add(three);
        Complex answer = new Complex(TEST1R + three, TEST1I);
        assertEquals(answer, z4);
    }
    
    /**
     * Test subtract method.
     */
    @Test
    void testSubtract() {
        Complex z5 = z1.subtract(z2);
        Complex answer = new Complex(TEST1R - TEST2R, TEST1I - TEST2I);
        assertEquals(answer, z5);
    }
    
    /**
     * Test multiply method.
     */
    @Test
    void testMultiply() {
        Complex z6 = z1.multiply(z2);
        double realPart = TEST1R * TEST2R - TEST1I * TEST2I;
        double imagPart = TEST1R * TEST2R + TEST1I * TEST2R;
        Complex answer = new Complex(realPart, imagPart);
        assertEquals(answer, z6);
    }
    
    /**
     * Test divide method.
     */
    @Test
    void testDivide() {
        Complex z7 = z1.divide(z2);
        double denominator = TEST2R * TEST2R + TEST2I * TEST2I;
        double realPart = TEST1R * (TEST2R / denominator) 
                - TEST1I * (-TEST2I / denominator);
        double imagPart = TEST1R * (-TEST2I / denominator) 
                + TEST1I * (TEST2R / denominator);
        Complex answer = new Complex(realPart, imagPart);
        
        assertEquals(answer , z7);
    }
    
    /**
     * Test method for the value of ONE.
     */
    @Test
    void testONEValue() {
        Complex answer = new Complex(1, 0);
        assertEquals(answer, Complex.ONE);
    }
    
    /**
     * Test method for the value of ONE.
     */
    @Test
    void testZEORValue() {
        Complex answer = new Complex(0, 0);
        assertEquals(answer, Complex.ZERO);
    }
    
    /**
     * Test method for the value of I.
     */
    @Test
    void testIValue() {
        Complex answer = new Complex(0, 1);
        assertEquals(answer, Complex.I);
    }

}
