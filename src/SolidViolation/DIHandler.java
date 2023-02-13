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
public class DIHandler {

    private final  ErrorLogger errorLogger = new ErrorLogger();

    void CreatePost(Database db, String postMessage) {
        try {
            db.Add(postMessage);
        } catch (Exception ex) {
            errorLogger.log(ex.getMessage());
        }
    }
}
