/**
 *
 * TODO Description if available.
 */

package com.movile.testing;

import java.text.MessageFormat;

public class SimpleStatic {

    /**
     * An static method that do this. Nothing more.
     *
     * @param a A required integer, meh.
     * @return A magic string.
     */
    public static String doThis(Integer a) {
        return MessageFormat.format("Omg! It''s the number {0}!", a);
    }

    /**
     * A method that does that.
     *
     * @return Another magic string.
     */
    public String doThat() {
        return new StringBuilder(doThis(1)).reverse().toString();
    }
}

// vim:ft=java ts=4 tw=80 cc=+1: 
