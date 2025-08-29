public class Book extends Item {
    private String author;
    private int releaseyear;
    private int numberPages;

    public Book(String title, String author, int releaseyear, int numberPages) {
        super(title);
        this.author = author;
        this.releaseyear = releaseyear;
        this.numberPages = numberPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseyear;
    }

    public int getNumberPages() {
        return numberPages;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return getTitle().equals(other.getTitle()) &&
               author.equals(other.author) &&
               releaseYear == other.releaseYear &&
               numberPages == other.numberPages;
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode() + author.hashCode() + releaseYear + numberPages;
    }
}
