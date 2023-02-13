/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInversion;

import SolidViolation.*;

/**
 *
 * @author pearlsoft
 */
class ErrorLogger {

    public ErrorLogger() {
    }

    void log(String message) {
        System.out.println("There is an error");
    }
    
}
