public class Test {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrower bookBorrower2 = new BookBorrower();
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower3 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower1 Author and Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.returnBook();
        System.out.println("BookBorrower2 returned the book");


//        bookBorrower3.borrowBook();
//        System.out.println(bookBorrower3.getAuthorAndTitle());
//        bookBorrower3.returnBook();
//        System.out.println(bookBorrower3.getAuthorAndTitle());

        System.out.println("END TESTING SINGLETON PATTERN");


    }
}
