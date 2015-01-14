package com.movile.testing;

/**
 * A very simple class with a very simple method.
 *
 * @author Ariel Gerardo Ríos (ariel.rios@movile.com)
 */
public class VerySimple {
    /**
     * Performs the sum of both intergers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of integers, as I already said ¬¬.
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * Performs a sum of both integers, but first is an object.
     *
     * @param a The integer as object.
     * @param b The integer as primitive.
     * @return The sum of both integers as well.
     */
    public int sumObject(Integer a, int b) {
        return a.intValue() + b;
    }
}

// vim:ft=java ts=4 tw=80 cc=+1: 
