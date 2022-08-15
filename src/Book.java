import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yeaOfPublication;

    public Book(String name, int yeaOfPublication, Author author) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yeaOfPublication == book.yeaOfPublication && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yeaOfPublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", yeaOfPublication=" + yeaOfPublication +
                '}';
    }
}

