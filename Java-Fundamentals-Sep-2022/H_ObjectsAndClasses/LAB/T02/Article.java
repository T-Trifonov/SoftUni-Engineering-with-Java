package H_ObjectsAndClasses.LAB.T02;

public class Article {

    private String title;
    private String content;
    private String Author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        Author = author;
    }

    public void Edit(String newContent) {
        this.content = newContent;

    }

    public void ChangeAuthor(String newAuthor) {
        this.Author = newAuthor;
    }

    public void Rename(String newTitle) {
        this.title = newTitle;
    }

    public String toString(){

        return String.format("%s - %s: %s", this.title, this.content, this.Author);
    }

}
