package examples.practice;

import java.util.Scanner;

public class LibraryManagement {

    private static final int maxSize = 100;
    private static final String[] booksId = new String[maxSize];
    private static final String[] booksTitle = new String[maxSize];
    private static final String[] booksAuthor = new String[maxSize];

    private static int bookCount = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("Library management menu: ");
            System.out.println("1. ADD BOOK");
            System.out.println("2. SEARCH BOOK BY TITLE");
            System.out.println("3. UPDATE BOOK BI ID");
            System.out.println("4. DISPLAY ALL");
            System.out.println("5. EXIT");
            System.out.println("Select option: ");

            int choice = safeInt(scanner);
            scanner.nextLine();
            switch (choice){
                case 1 -> addBook(scanner);
                case 2 -> searchBook(scanner);
                case 3 -> updateBook(scanner);
                case 4 -> displayAll();
                case 5 -> {
                    System.out.println("Closing the Library management");
                    running = false;
                }
                default ->{
                    System.out.println("Invalid Data : Select the valid input from the above options. ");
                    scanner.nextInt();
                }
            }
        }
        scanner.close();
    }

    private static void addBook(Scanner scanner) {
        System.out.println("Enter book ID: ");
        String newId = scanner.nextLine();
        if (newId.isEmpty()){
            System.out.println("Book ID should not be empty");
            return;
        }
        for (int i = 0; i < bookCount; i++ ){
            if (booksId[i] != null && booksId[i].equalsIgnoreCase(newId)){
                System.out.println("Book ID already exist in the Data");
                return;
            }
        }
        System.out.println("Enter book title");
        String newTitle = scanner.nextLine();

        System.out.println("Enter book author");
        String newAuthor = scanner.nextLine();

        booksId[bookCount] = newId;
        booksTitle[bookCount] = newTitle;
        booksAuthor[bookCount] = newAuthor;
        bookCount ++;
        System.out.println("The book has been successfully updated");

    }

    private static void searchBook(Scanner scanner){
        if (bookCount <= 0){
            System.out.println("No books are in t he library");
            return;
        }

        System.out.println("Enter book title: ");
        String newTitle =  scanner.nextLine().trim();

        if (newTitle .isEmpty()){
            System.out.println("Book name can not be empty");
            return;
        }
        boolean found = false;
        for (int i = 0; i < bookCount; i++){
            if (booksTitle[i] != null && booksTitle[i].equalsIgnoreCase(newTitle)){
                System.out.println("ID : "+ booksId[i]);
                System.out.println("BOOK TITLE" + booksTitle[i] );
                System.out.println("Book Author" + booksAuthor[i]);
                System.out.println("Book has been found ");
                found = true;
                break;
            }
        }
        if (!found ){
            System.out.println("The book has npt been found with the title: "+ newTitle);
        }

    }

    private static void updateBook(Scanner scanner){
        if (bookCount <= 0){
            System.out.println("No books in the library");
            return;
        }
        boolean updated = false;
        System.out.println("Enter the ID to update");
        String newId = scanner.nextLine();
        if (newId.isEmpty()){
            System.out.println("The ID value can noy be empty");
            return;
        }
        for (int i = 0; i< bookCount; i++){
            if (booksId[i] != null && booksId[i].equalsIgnoreCase(newId)){
                System.out.println("Enter new title: ");
                String newTitle = scanner.nextLine();
                if (newTitle.isEmpty()){
                    System.out.println("Title value can not be empty");
                    return;
                }

                System.out.println("Enter new author");
                String newAuthor = scanner.nextLine();
                if (newAuthor.isEmpty()){
                    System.out.println("New author value can not be empty");
                    return;
                }
                booksTitle[i] = newTitle;
                booksAuthor[i] = newAuthor;
                System.out.println("The books data has been updated successfully");
                updated = true;
                break;
            }
        }
        if (!updated){
            System.out.println("Can not found any book with ID :"+newId);
        }
    }
    private static void displayAll(){
        if (bookCount <= 0){
            System.out.println("No books in the library");
            return;
        }
        for (int i = 0; i < bookCount; i ++){
            System.out.println((i+1)+ ".ID : "+booksId[i]+". TITLE : "+booksTitle[i]+ ". AUTHOR : "+ booksAuthor[i]);
        }
    }

    private static int safeInt(Scanner scanner) {
        if (!scanner.hasNextInt()){
            System.out.println("Invalid input: Select a correct number. ");
            scanner.next();
        }
        return scanner.nextInt();
    }

}
