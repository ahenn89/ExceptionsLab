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
public class UppercaseMandatoryException extends IllegalArgumentException{
    
     private static final String MSG = "Input must be uppercase"; 

    public UppercaseMandatoryException() {
        super(MSG);
    }

    public UppercaseMandatoryException(String s) {
        super(MSG);
    }

    public UppercaseMandatoryException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public UppercaseMandatoryException(Throwable cause) {
        super(cause);
    }


}
