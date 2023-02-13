/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRP;


import java.util.List;


class PostHandler
{
    private Database database = new Database();

    void HandleNewPosts(Post post, String postMessage) {
            post.CreatePost(database, postMessage);
    }
    
    public static void main(String[] args) {
        PostHandler handler = new PostHandler();
        Post post = new TagPostImp();
        
        handler.HandleNewPosts(post,"Hello World");
    }

    
}