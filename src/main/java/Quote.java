import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private String content;
    private Author authorName;

    public Quote(){}

    public Quote(long id, String content, Author author) {
        this.content = content;
        this.authorName = author;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return authorName;
    }

    public void setAuthor(Author author) {
        this.authorName = author;
    }
}
