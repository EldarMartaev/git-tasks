public class PostComment {
    private String text; // содержание комментария
    private String[] whoLiked; // кто поддержал

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String[] getWhoLiked() {
        return whoLiked;
    }
    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }
    public String toString() {
        String likedStr = "null";
        if (whoLiked != null) {
            likedStr = "[";
            for (int i = 0; i < whoLiked.length; i++) {
                likedStr += (whoLiked[i]);
                if (i < whoLiked.length - 1) {
                    likedStr += ", ";
                }
            }
        }
        return "PostComment{text='" + text + "', whoLiked=" + likedStr + "]}";
    }
}
