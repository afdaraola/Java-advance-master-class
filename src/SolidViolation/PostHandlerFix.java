package SolidViolation;

import java.util.ArrayList;
import java.util.List;


    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    class DatabaseFix {

        void Add(String postMessage) {
            System.out.println("Adding Post");
        }

        void AddAsTag(String postMessage) {
            System.out.println("Adding Tag Post");
        }

        void NotifyUser(String user) {
            System.out.println("Notify User...");
        }

        void MentionPost(String User){ System.out.println("Mention Post"); }

        void OverrideExistingMention(String user, String postMessage) {
            System.out.println("Override mention");
        }

        List<String> getUnhandledPostsMessages() {
            System.out.println("Getting unhandled post messages...");
            return new ArrayList<>();
        }

        String parseUserFix() {
            System.out.println("Parsing User");
            return "";
        }

    }

    /**
     *
     * @author pearlsoft
     */
    class PostFix
    {
        void CreatePost(SolidViolation.DatabaseFix db, String postMessage)
        {
            db.Add(postMessage);
        }


    }

    interface TagPostFix
    {

        void CreatePost(SolidViolation.DatabaseFix db, String postMessage);



    }

interface MentionPostFix
    {
        void CreateMentionPost(SolidViolation.DatabaseFix db, String postMessage);


    }

    class PostHandlerFix
    {
        private SolidViolation.DatabaseFix database = new SolidViolation.DatabaseFix();

        void HandleNewPostsFix() {
            List<PostFix> newPosts = new ArrayList<>();

           newPosts.add(new Mentions());
           newPosts.add(new AddTags());

        }

        public static void main(String[] args) {
            SolidViolation.PostHandlerFix handler = new SolidViolation.PostHandlerFix();
            handler.HandleNewPostsFix();
        }
    }

