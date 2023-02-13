/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRP;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pearlsoft
 */
class Database {

    void Add(String postMessage) {
        System.out.println("Adding Post");
    }

    void AddAsTag(String postMessage) {
         System.out.println("Adding Tag Post");
    }

    void NotifyUser(String user) {
        System.out.println("Notify User...");
    }

    void OverrideExistingMention(String user, String postMessage) {
        System.out.println("Override mention");
    }

    List<String> getUnhandledPostsMessages() {
        System.out.println("Getting unhandled post messages...");
        return new ArrayList<>();
    }

    String parseUser() {
        System.out.println("Parsing User");
        return "";
    }
    
}
