/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolidViolation;


import java.util.ArrayList;
import java.util.List;

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

/**
 *
 * @author pearlsoft
 */
class Post
{
    void CreatePost(Database db, String postMessage)
    {
        db.Add(postMessage);
    }
}

class TagPost extends Post
{
   
    void CreatePost(Database db, String postMessage)
    {
        db.AddAsTag(postMessage);
    }
}

class MentionPost extends Post
{
    void CreateMentionPost(Database db, String postMessage)
    {
        String user = db.parseUser();

        db.NotifyUser(user);
        db.OverrideExistingMention(user, postMessage);
        super.CreatePost(db, postMessage);
    }
}

class PostHandler
{
    private Database database = new Database();

    void HandleNewPosts() {
        List<String> newPosts = database.getUnhandledPostsMessages();

        for (String postMessage : newPosts)
        {
            Post post;

            if (postMessage.startsWith("#"))
            {
                post = new TagPost();
            }
            else if (postMessage.startsWith("@"))
            {
                post = new MentionPost();
            }
            else {
                post = new Post();
            }

            post.CreatePost(database, postMessage);
        }
    }
    
    public static void main(String[] args) {
        PostHandler handler = new PostHandler();
        handler.HandleNewPosts();
    }
}