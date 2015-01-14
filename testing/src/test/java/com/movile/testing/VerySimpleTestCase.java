/**
 * VerySimpleTestCase
 *
 * TODO Description if available.
 */

package com.movile.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case for this very simple class.
 *
 * @author Ariel Gerardo Ríos (ariel.rios@movile.com)
 */
public class VerySimpleTestCase {

    private int a;

    private int b;

    private VerySimple vs;

    @Before
    public void setUp() {
        a = 1;
        b = 2;

        vs = new VerySimple();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSum() {
        Assert.assertEquals(3, vs.sum(a, b));
    }

    @Test
    public void testSumObjectOk() {
        Assert.assertEquals(3, vs.sumObject(a, b));
    }

    @Test(expected = NullPointerException.class)
    public void testSumObjectFailed() {
        vs.sumObject(null, b);
    }
}
