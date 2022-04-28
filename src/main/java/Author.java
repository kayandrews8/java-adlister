import java.io.Serializable;

public class Author implements Serializable {
    private long id;
    private String authorName;

    public Author(){}

    public Author(long id, String authorName) {
        this.authorName = authorName;
    }

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
