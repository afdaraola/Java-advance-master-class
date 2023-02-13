/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolidViolation;

/**
 *
 * @author pearlsoft
 */
class ErrorLogger  implements IErrorlogger {

    public ErrorLogger() {
    }

    public void log(String message) {
        System.out.println("There is an error");
    }
    
}
