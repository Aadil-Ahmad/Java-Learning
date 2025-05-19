package examples.practice;

import java.util.Scanner;

public class LibraryManagementSystem {
    private static final int maxSize = 100;

    private static final String[] booksId = new String[maxSize];
    private static final String[] booksTitle = new String[maxSize];
    private static final String[] booksAuthor = new String[maxSize];
    private static int bookCount = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("The library management menu");
            System.out.println("1. ADD BOOK");
            System.out.println("2, SEARCH BY TITLE");
            System.out.println("3. UPDATE WITH ID");
            System.out.println("4. DISPLAY ALL ");
            System.out.println("5. EXIT");
            System.out.println("Select option: ");

//            int choice = scanner.nextInt();
            int choice = getSafeInt(scanner);
            scanner.nextLine();
            switch (choice){
                case 1-> addBook(scanner);
                case 2-> searchBook(scanner);
                case 3-> updateBook(scanner);
                case 4-> displayAll();
                case 5-> {
                    System.out.println("Exiting library management");
                    running = false;
                }
                default -> System.out.println("Invalid option");
            }
        }
        scanner.close();
    }

    public static synchronized void addBook(Scanner scanner){
        if (bookCount >= maxSize){
            System.out.println("Library is full.");
            return;
        }
        System.out.println("Enter book ID: ");
        String newId = scanner.nextLine().trim();
        if (newId.isEmpty()){
            System.out.println("Book id cannot be empty");
            return;
        }
        for (int i = 0; i < bookCount; i++){
            if (booksId[i] != null && booksId[i].equalsIgnoreCase(newId)){
                System.out.println("A book ID already exists");
                return;
            }
        }
        System.out.println("Enter book title");
        String newTitle = scanner.nextLine().trim();
        if (newTitle.isEmpty()){
            System.out.println("Book title can not be empty");
            return;
        }
        System.out.println("Enter book author");
        String newAuthor = scanner.nextLine().trim();
        if (newAuthor.isEmpty()){
            System.out.println("Book author can not be empty");
            return;
        }
        booksId[bookCount] = newId;
        booksTitle[bookCount] = newTitle;
        booksAuthor[bookCount] = newAuthor;
        bookCount++;
        System.out.println("The book has been added successfully: ");
    }

    public static synchronized void searchBook(Scanner scanner){
        if (bookCount <= 0 ){
            System.out.println("No books in the Library\n\n");
            return;
        }
        System.out.println("Enter book title: ");
        String newTitle = scanner.nextLine().trim();
        if (newTitle.isEmpty()){
            System.out.println("The book title can not be empty");
            return;
        }
        boolean found = false;
        for (int i = 0; i < bookCount; i ++){
            if(booksTitle[i] != null && booksTitle[i].equalsIgnoreCase(newTitle)){
                System.out.println("Book found0");
                System.out.println("ID: "+booksId[i]);
                System.out.println("TITLE: "+ booksTitle[i]);
                System.out.println("AUTHOR: "+ booksAuthor[i]);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("No book found with title: "+ newTitle +"\n");
        }
    }


   public static synchronized void updateBook(Scanner scanner){
        if (bookCount <= 0){
            System.out.println("No books available to update");
            return;
        }
        System.out.println("Enter book ID : ");
        String newId = scanner.nextLine().trim();
        if (newId .isEmpty()){
            System.out.println("Book id can not be empty \n");
            return;
        }
        boolean updated = false;
        for (int i = 0 ; i < bookCount; i++){
            if (booksId[i] != null && booksId[i].equalsIgnoreCase(newId)){
                System.out.println("Enter the new title: ");
                String newTitle = scanner.nextLine();
                if (newTitle.isEmpty()){
                    System.out.println("Book title can not be empty");
                    return;
                }
                System.out.println("Enter new Author: ");
                String newAuthor = scanner.nextLine();
                if (newAuthor .isEmpty()){
                    System.out.println("The book author can not be empty");
                    return;
                }
                booksTitle[i] = newTitle;
                booksAuthor[i] = newAuthor;
                System.out.println("The book has been updated successfully");
                updated = true;
                break;
            }
        }
        if (!updated){
            System.out.println("Not found any book with this ID \n");
        }
   }

    public static void displayAll(){
        if (bookCount <= 0){
            System.out.println("The library is empty\n\n");
            return;
        }
        System.out.println("Books in Library: ");
        for (int i = 0; i < bookCount; i++){
            System.out.println((i+1)+". ID : "+ booksId[i]+". Title : "+ booksTitle[i]+ ". Author : "+ booksAuthor[i]);
        }
        System.out.println("\n");

    }

    private static int getSafeInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Select a correct number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

}
