/**
 * SimpleCompositionTestCase
 *
 * TODO Description if available.
 */

package com.movile.testing;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Test cases for simple composition.
 *
 * @author Ariel Gerardo Ríos (ariel.rios@movile.com)
 */
@RunWith(MockitoJUnitRunner.class)
public class SimpleCompositionTestCase {

    @Spy
    private VerySimple vs;

    @InjectMocks
    private SimpleComposition sc;

    private int a;

    private int b;

    @Before
    public void setUp() {
        a = 1;
        b = 2;

        // vs = Mockito.spy(VerySimple.class);
        // sc = new SimpleComposition(vs);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSum2Ok() {
        sc.sum2(a, b);
        verify(vs, times(1)).sum(a, b);
    }

    @Test(expected = RuntimeException.class)
    public void testSum2Fail() {
        doThrow(new RuntimeException("Lalalala")).when(vs).sum(anyInt(), anyInt());
        sc.sum2(a, b);
    }
}

// vim:ft=java ts=4 tw=80 cc=+1: 
