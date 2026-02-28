
public class Book {
    String title;
    int pages;
    boolean isBorrowed;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.isBorrowed = false;
    }

    void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        System.out.println("Borrowed: " + isBorrowed);
    }

    void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Already borrowed");
        }
    }

    void returnBook() {
        isBorrowed = false;
        System.out.println("Book returned");
    }

    void readingTime(int minutesPerPage) {
        minutesPerPage = 60;
        System.out.println("Estimated reading time: " + pages * minutesPerPage + " minutes");
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", 300);
        Book book2 = new Book("Algorithms", 500);
        Book book3 = new Book("Poetry", 120);

        book1.printInfo();
        book1.borrowBook();
        book1.returnBook();
        book1.readingTime(2);

        System.out.println("/*/*/*/*/*/*/*/");

        book2.printInfo();
        book2.borrowBook();
        book2.returnBook();
        book2.readingTime(5);

    }
}
