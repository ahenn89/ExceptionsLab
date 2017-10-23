/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author Ashlee
 */
public class MandatoryStringException extends IllegalArgumentException{
    private final static String msg = "Method argument is mandatory.";
    
    /*
        must have every constructor from the superclass exception
    */
    public MandatoryStringException() {
        //msg must be static in order for it to belong to the class, and not the instance. if not static, the following line will fail. 
        super(msg);
    }

    public MandatoryStringException(String s) {
        //dont allow programmers to set their own message. Always use ours. 
        super(msg);
    }

    public MandatoryStringException(String message, Throwable cause) {
        super(msg, cause);
    }

    public MandatoryStringException(Throwable cause) {
        super(cause);
    }
}
