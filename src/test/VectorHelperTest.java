/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TOSHIBA
 */
public class VectorHelperTest {
    
    public VectorHelperTest() {
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
     * Test of Sommer method, of class VectorHelper.
     */
    @Test
    public void testSommer() throws Exception {
        System.out.println("Sommer");
        int[] Tab2 = {1,2,5,10};
        int taille2 = 4;
        VectorHelper instance = new VectorHelper(Tab2,4);
        int[] expResult = {2,4,10,20};
        int[] result = instance.Sommer(Tab2, taille2);
        assertArrayEquals(expResult, result);
    }

    
    /**
     * Second Test  of Sommer method, of class VectorHelper.
     * Declenche l'exception InegaliteException
     */
    @Test(expected=InegaliteException.class)
    public void testSommer2() throws Exception {
        System.out.println("Sommer");
        int[] Tab = {1,2,5,10,12};
        int[] Tab2 = {1,2,5,10};
        int taille2 = 4;
        VectorHelper instance = new VectorHelper(Tab,5);
        int[] expResult = {2,4,10,20};
        int[] result = instance.Sommer(Tab2, taille2);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of trier method, of class VectorHelper.
     */
    @Test
    public void testTrier() {
        System.out.println("trier");
        int[] Tab = {100,25,5,10,42};
        VectorHelper instance = new VectorHelper(Tab,5);
        int[] expResult = {5,10,25,42,100};
        int[] result = instance.getTab();
         instance.trier();
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of maxmin method, of class VectorHelper.
     */
    @Test
    public void testMaxmin() {
        System.out.println("maxmin");
         int[] Tab = {100,25,-5,10,42};
        VectorHelper instance = new VectorHelper(Tab,5);
        instance.maxmin();
        int expResultMax = 100 ;
        int resultMax = instance.getMax();
        int expResultMin = -5 ;
        int resultMin = instance.getMin();
        
        assertEquals(expResultMax, resultMax);
        assertEquals(expResultMin, resultMin);
    }

    /**
     * Test of inverser method, of class VectorHelper.
     */
    @Test
    public void testInverser() {
        System.out.println("inverser");
        int[] Tab = {100,25,-5,10,42};
        VectorHelper instance = new VectorHelper(Tab,5);
        int[] expResult = {42,10,-5,25,100};
        int[] result = instance.inverser();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of FnctApplique method, of class VectorHelper.
     * Tester la premiere formule
     */
    @Test
    public void testFnctApplique() {
        System.out.println("FnctApplique");
        int[] f = {1,5};
        int[] Tab = {100,25,-5,10,42};
        VectorHelper instance = new VectorHelper(Tab,5);
        instance.FnctApplique(f);
        int[] expResult = {500,125,-25,50,210};
        int[] result = instance.getTab();
        assertArrayEquals(expResult, result);
    }
    
     /**
     * Test of FnctApplique method, of class VectorHelper.
     *  Tester la 2eme formule
     */
    @Test
    public void testFnctApplique2() {
        System.out.println("FnctApplique");
        int[] f = {2,0};
        int[] Tab = {100,25,-5,10,42};
        VectorHelper instance = new VectorHelper(Tab,5);
        instance.FnctApplique(f);
        int[] expResult = {1,1,1,1,1};
        int[] result = instance.getTab();
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of FnctApplique method, of class VectorHelper.
     *  Tester la 3eme formule
     */
    @Test
    public void testFnctApplique3() {
        System.out.println("FnctApplique");
        int[] f = {3,-8};
        int[] Tab = {100,25,-5,10,42};
        VectorHelper instance = new VectorHelper(Tab,5);
        instance.FnctApplique(f);
        int[] expResult = {92,17,-13,2,34};
        int[] result = instance.getTab();
        assertArrayEquals(expResult, result);
    } 

  
}
