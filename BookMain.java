package Teams.day5;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            books[i] = Book.getBookDetailsFromUser(in);
            System.out.println();
        }

        // Display details of all books
        System.out.println("Details of all books:");
        for (Book book : books) {
            book.displayBookDetails();
        }


    }
    }