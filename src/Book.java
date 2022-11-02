public class Book {
    private Author author;
    private String bookName;
    int year;
    public Author getAuthor() {
        return author;
    }
    public String getBookName() {
        return bookName;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Book (Author author, String bookName, int year){
        this.author = author;
        this.bookName = bookName;
        this.year = year;
    }
    public String toString() {
        return author.toString() + " Название: " + bookName + " Год издания: " + year;
    }
    public boolean equals (Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        if (this == other){
            return true;
        }
        Book book1 = (Book) other;
        return true;
    }
    public int hashCode() {
        return java.util.Objects.hash(bookName, year);
    }
}
