package SolidViolation;

public class Mentions  extends PostFix implements MentionPostFix {

    @Override
    public void CreateMentionPost(DatabaseFix db, String postMessage) {
        db.MentionPost("Mention User");

    }
}
