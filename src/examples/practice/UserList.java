package examples.practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList {
    public static void main(String[] args) {
        List<String> userNames = new ArrayList<>();
        userNames.add("Hyder");
        userNames.add("Vinoth");
        userNames.add("Kamal");
        userNames.add("Raj");
        userNames.add("Raj Kamal");
        System.out.println("Enter the user name you want to found");
        Scanner scanner = new Scanner(System.in);
        String userToFound = scanner.next();
        boolean found = false;
        for (String userName : userNames){
            if (userName.equals(userToFound)){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("User found");
        }else {
            System.out.println("User not found");
        }
        scanner.close();
    }

}
