package SolidViolation;

public class AddTags extends PostFix implements TagPostFix   {

    @Override
    public void CreatePost(DatabaseFix db, String postMessage) {
        db.AddAsTag("Tags User");

    }
}
