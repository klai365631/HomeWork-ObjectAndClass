public class Book {
    private String name;
    private Author author;
    private int yeaOfPublication;

    public Book(String name,int yeaOfPublication,Author author) {
        this.name = name;
        this.yeaOfPublication = yeaOfPublication;
        this.author = author;

    }

    public void setYeaOfPublication(int yeaOfPublication) {
        this.yeaOfPublication = yeaOfPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYeaOfPublication() {
        return yeaOfPublication;
    }

}

