class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James", "ISBN001");
        Book b2 = new Book("Python Guide", "Guido", "ISBN002");
        b1.displayDetails();
        b2.displayDetails();
        Book.displayLibraryName();
    }
}