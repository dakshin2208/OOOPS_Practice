package Teams.day5;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;
    private int numCopies;

    // Constructor
    public Book(String title, String author, double price, int numCopies) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.numCopies = numCopies;
    }

    // Method to get book details from the user
    public static Book getBookDetailsFromUser(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter number of copies: ");
        int numCopies = scanner.nextInt();

        scanner.nextLine(); // Consume the remaining newline

        return new Book(title, author, price, numCopies);
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Number of Copies: " + numCopies);
        System.out.println();
    }
}

