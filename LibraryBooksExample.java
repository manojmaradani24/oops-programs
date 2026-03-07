class Book {
    String bookName = "Java Programming";
    void showBook() {
        System.out.println("Book Name: " + bookName);
    }
}
class Library {
    Book b = new Book();
    void display() {
        System.out.println("Library contains:");
        b.showBook();
    }
}
public class LibraryBooksExample {
    public static void main(String[] args) {
        Library l = new Library();
        l.display();
    }
}