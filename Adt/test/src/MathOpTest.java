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
public class MathOpTest {
    
    public MathOpTest() {
    }

    /**
     * Test of add method, of class MathOp.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 3;
        MathOp instance = new MathOp();
        int expResult = 8;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        a = 7;
        b = 8;
        expResult = 15;
        result = instance.add(a, b);
        assertEquals(expResult, result);
        
        //Corner cases
        a = Integer.MAX_VALUE;
        b = 1;
        result = instance.add(a, b);
        //assertThrows("Cannot add two large numbers",Class, runnable)
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class MathOp.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int a = 8;
        int b = 3;
        MathOp instance = new MathOp();
        int expResult = 5;
        int result = instance.sub(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dot method, of class MathOp.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        int a = 5;
        int b = 3;
        MathOp instance = new MathOp();
        int expResult = 15;
        int result = instance.dot(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class MathOp.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int a = 5;
        int b = 3;
        MathOp instance = new MathOp();
        int expResult = 1;
        int result = instance.div(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
