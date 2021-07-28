/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclassv2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KrisT
 */
public class CountryTest {
    
    public CountryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setCountry method, of class Country.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String name = "";
        Country instance = new Country();
        instance.setCountry(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class Country.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Country instance = new Country();
        String expResult = "Australia";
        String result = instance.getCountry();
        assertEquals(expResult, result, "It should show Australia");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPop method, of class Country.
     */
    @Test
    public void testSetPop() {
        System.out.println("setPop");
        int population = 0;
        Country instance = new Country();
        instance.setPop(population);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPop method, of class Country.
     */
    @Test
    public void testGetPop() {
        System.out.println("getPop");
        Country instance = new Country();
        int expResult = 24000000;
        int result = instance.getPop();
        assertEquals(expResult, result, 24000000);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapCity method, of class Country.
     */
    @Test
    public void testGetCapCity() {
        System.out.println("getCapCity");
        Country instance = new Country();
        String expResult = "Camberra";
        String result = instance.getCapCity();
        assertEquals(expResult, result, "It should show Camberra");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
