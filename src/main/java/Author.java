import java.io.Serializable;

public class Author implements Serializable {
    private String authorName;

    public Author(){}

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
