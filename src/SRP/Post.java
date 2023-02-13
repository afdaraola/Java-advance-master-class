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


interface Post
{ 
    default void  CreatePost(Database db, String postMessage)
    {
        db.Add(postMessage);
    }
}

