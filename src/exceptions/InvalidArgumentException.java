/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exceptions;

/**
 *
 * @author istoe
 */
public class InvalidArgumentException extends Exception {

    /**
     * Creates a new instance of <code>InvalidArgumentException</code> without
     * detail message.
     */
    public InvalidArgumentException() {
    }

    /**
     * Constructs an instance of <code>InvalidArgumentException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidArgumentException(String msg) {
        super(msg);
    }
}
