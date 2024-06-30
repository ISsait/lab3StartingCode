/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exceptions;

/**
 *
 * @author School
 */
public class KeyNotFoundException extends Exception{

    /**
     * Creates a new instance of <code>KeyNotFoundException</code> without
     * detail message.
     */
    public KeyNotFoundException() {
    }

    /**
     * Constructs an instance of <code>KeyNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public KeyNotFoundException(String msg) {
        super(msg);
    }
}
