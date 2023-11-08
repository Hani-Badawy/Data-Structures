/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package src;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hmohamme
 */
public class AlgebraTest {
    
    public AlgebraTest() {
    }

    /**
     * Test of add method, of class Algebra.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        Algebra instance = new AlgebraImpl();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Algebra.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int a = 0;
        int b = 0;
        Algebra instance = new AlgebraImpl();
        int expResult = 0;
        int result = instance.sub(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dot method, of class Algebra.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        int a = 0;
        int b = 0;
        Algebra instance = new AlgebraImpl();
        int expResult = 0;
        int result = instance.dot(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Algebra.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int a = 0;
        int b = 0;
        Algebra instance = new AlgebraImpl();
        int expResult = 0;
        int result = instance.div(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AlgebraImpl implements Algebra {

        public int add(int a, int b) {
            return 0;
        }

        public int sub(int a, int b) {
            return 0;
        }

        public int dot(int a, int b) {
            return 0;
        }

        public int div(int a, int b) {
            return 0;
        }
    }
    
}
