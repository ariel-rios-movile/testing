/**
 * SimpleComposition
 *
 * TODO Description if available.
 */

package com.movile.testing;

/**
 * Very simple object composition & producing a black box.
 *
 * @author Ariel Gerardo Ríos (ariel.rios@movile.com)
 */
public class SimpleComposition {

    private VerySimple vs;

    /**
     * Constructor.
     *
     * @param vs The sum implementation.
     */
    public SimpleComposition(VerySimple vs) {
        this.vs = vs;
    }

    /**
     * Performs the sum operation and keeps it for itself.
     *
     * @param a The first integer.
     * @param b The second integer.
     */
    public void sum2(int a, int b) {
        vs.sum(a, b);
    }
}


// vim:ft=java ts=4 tw=80 cc=+1: 
