/**
 * SimpleStaticTestCase
 *
 * TODO Description if available.
 */

package com.movile.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ SimpleStatic.class })
public class SimpleStaticTestCase {

    private SimpleStatic ss;

    @Before
    public void setUp() {
        ss = new SimpleStatic();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testDoThisOk() {
        Assert.assertEquals("Omg! It's the number 1!", SimpleStatic.doThis(1));
    }

    @Test
    public void testDoThatOk() {
        PowerMockito.mockStatic(SimpleStatic.class);
        Mockito.when(SimpleStatic.doThis(Mockito.anyInt())).thenReturn("A string");

        Assert.assertEquals("gnirts A", ss.doThat());
    }
}

// vim:ft=java ts=4 tw=80 cc=+1: 
