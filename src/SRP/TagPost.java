/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRP;

import SRP.Database;

/**
 *
 * @author pearlsoft
 */


interface TagPost extends Post
{ 
    
    default void CreateTagPost(Database db, String postMessage)
    {
        CreatePost(db, postMessage);
    }
    
}

