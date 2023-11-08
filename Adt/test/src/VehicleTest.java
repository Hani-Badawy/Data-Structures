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
public class VehicleTest {
    
    public VehicleTest() {
    }

    /**
     * Test of move method, of class Vehicle.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Vehicle instance = new VehicleImpl();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VehicleImpl implements Vehicle {

        public void move() {
        }
    }
    
}
