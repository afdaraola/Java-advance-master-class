/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRP;


/**
 *
 * @author pearlsoft
 */


interface MentionPost extends Post
{ 
    default void CreateMentionPost(Database db, String postMessage)
    {
        String user = db.parseUser();

        db.NotifyUser(user);
        db.OverrideExistingMention(user, postMessage);
        CreatePost(db, postMessage);
    }
}

