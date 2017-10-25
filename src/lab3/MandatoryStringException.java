/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Ashlee
 */
public class MandatoryStringException  extends IllegalArgumentException{
    
    private final static String MSG = "Method argument is mandatory";

    public MandatoryStringException() {
        super(MSG);
    }

    public MandatoryStringException(String s) {
        super(MSG);
    }

    public MandatoryStringException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public MandatoryStringException(Throwable cause) {
        super(cause);
    }

    
}
