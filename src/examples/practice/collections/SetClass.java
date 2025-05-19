package examples.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {

        Set<String> st = new HashSet<>();
        System.out.println("The elements are: "+st);  // EMPTY HASH SET WILL APPEAR

//        ADDING THE ELEMENTS IN THE SET
        st.add("java");
        st.add("kotlin");
        st.add("Android");
        st.add("BLE");
        st.add("IoT");
        st.add("Endorphins");
        st.add("Studios");
        System.out.println("The added elements in the set are: "+ st+", ");

        Set<String> st1 = new HashSet<>(Arrays.asList("java", "kotlin","android","", "ble","kotlin","java","ble"));
        System.out.println("The string elements of the set are: "+st1);
        System.out.println(st1.contains("kotlin"));

//        OPERATION ONS SET
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.addAll(Arrays.asList(1,2,3,5,4,6,8));
        set2.addAll(Arrays.asList(2,9,6,7,0));
        System.out.println(set1);
        System.out.println(set2);
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        System.out.println(result);

        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3, 5, 4, 6, 8));
        System.out.println(set3);
        for (int i : result){
            System.out.print(i);
        }
        result.add(10);
        System.out.println("\n"+result);

//        Performing Various Operations on SortedSet
//        1. ADDITION
        result.add(10);
        System.out.println("\nADDITION OPERATION"+result);

//        2. ACCESSING THE ELEMENTS
        int num = 9;
        System.out.println("CONTAINS: "+num+" "+result.contains(num));

//        3. REMOVING
        int removedNumber = 5;
        result.remove(removedNumber);
        System.out.println("The number: "+removedNumber+" has been removed: "+result);

        for (int in : result){
            System.out.print(in);
        }
    }
}
