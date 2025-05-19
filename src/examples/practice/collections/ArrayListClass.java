package examples.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {
    public static void main(String[] args) {
//        Creating the ARRAY-LIST in STRING type      #####################
        ArrayList<String> al = new ArrayList<>();
        al.add("Android");
        al.add("Flutter");
        al.add("Compose");
        al.add("Kotlin");
        al.add("Java");
        System.out.println(al);
        for (String s : al){
            System.out.print(s+" ");
        }

        //        Creating the ARRAY-LIST in Integer type     #####################
        ArrayList<Integer> ali = new ArrayList<>();
        for (int i = 0; i<=5; i++){
            ali.add(i);
        }
        System.out.println("\nThe integer array list is: "+ali);
        System.out.println("The size of the array list ali is: "+ali.size());
        int at4thPlace = ali.get(4);
        System.out.println("The element at the place 4th is: "+at4thPlace);
        ali.remove(3);
        System.out.println(ali);
        ali.add(3,96);
        System.out.println(ali);




    }
}
