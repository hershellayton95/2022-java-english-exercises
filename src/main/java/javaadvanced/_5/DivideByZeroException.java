package javaadvanced._5;

/**
 * Thrown to indicate that the application has attempted to convert
 * a string to one of the numeric types, but that the string does not
 * have the appropriate format.
 *
 * @see     java.lang.Integer#parseInt(String)
 * @since   1.0
 */
public class DivideByZeroException extends IllegalArgumentException {


    /**
     * Constructs a {@code NumberFormatException} with no detail message.
     */
    public DivideByZeroException () {
        super();
    }

    /**
     * Constructs a {@code NumberFormatException} with the
     * specified detail message.
     *
     * @param   s   the detail message.
     */
    public DivideByZeroException (String s) {
        super (s);
    }

    /**
     * Factory method for making a {@code NumberFormatException}
     * given the specified input which caused the error.
     *
     * @param   s   the input causing the error
     */
    static DivideByZeroException forInputString(String s, int radix) {
        return new DivideByZeroException("For input string: \"" + s + "\"" +
                (radix == 10 ?
                        "" :
                        " under radix " + radix));
    }

    /**
     * Factory method for making a {@code NumberFormatException}
     * given the specified input which caused the error.
     *
     * @param   s   the input causing the error
     * @param   beginIndex   the beginning index, inclusive.
     * @param   endIndex     the ending index, exclusive.
     * @param   errorIndex   the index of the first error in s
     */
    static DivideByZeroException forCharSequence(CharSequence s,
                                                 int beginIndex, int endIndex, int errorIndex) {
        return new DivideByZeroException("Error at index "
                + (errorIndex - beginIndex) + " in: \""
                + s.subSequence(beginIndex, endIndex) + "\"");
    }
}