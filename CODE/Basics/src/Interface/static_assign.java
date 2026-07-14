package Interface;

public class static_assign {

    static class Book {
        static int totalBooksIssued = 0;

        void issueBook() {
            totalBooksIssued++;
            System.out.println("Book Issued");
        }
        static void getTotalIssued() {
            System.out.println("Total Books Issued: " + totalBooksIssued);
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.issueBook();
        b2.issueBook();
        b3.issueBook();

        Book.getTotalIssued();
    }
}