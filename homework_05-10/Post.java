import java.util.ArrayList;

public class Post {
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; // комментарии
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String[] getTags() {
        return tags;
    }
    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public ArrayList<PostComment> getComments() {
        return comments;
    }
    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    public String toString() {
        String commentsStr = "comments=[";

        for (int i = 0; i < comments.size(); i++) {
            commentsStr += (comments.get(i));
            if (i < comments.size() - 1) {
                commentsStr += ", ";
            }
        }
        commentsStr += "]";

        String tagsStr = "tags=[";
        for (int i = 0; i < tags.length; i++) {
            tagsStr += (tags[i]);
            if (i < tags.length - 1) {
                tagsStr += ", ";
            }
        }

        return "Post{" +
                "title='" + title + "'" + ", content.length=" + content.length() + ", " + tagsStr + "], " + commentsStr + '}';
    }
}
