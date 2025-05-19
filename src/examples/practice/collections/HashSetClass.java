package examples.practice.collections;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
//########         It is used to store the unique elements, and it doesn't maintain any specific order of elements.
        HashSet<Integer> hsi = new HashSet<>();
        System.out.println(hsi);   // Can store the Null values.
        hsi.add(125);
        hsi.add(85);
        hsi.add(36);
        hsi.add(6624);
        hsi.add(0);
        System.out.println(hsi);
        int hashSetSize = hsi.size();
        System.out.println("The size of the hash set is: "+hashSetSize);
        hsi.clear();  // Used to remove all the elements from the set.
        System.out.println("The hash set after the elements are cleared: "+hsi);

        HashSet<String> hss = new HashSet<>();
        hss.add("Compose");
        hss.add("Flutter");
        hss.add("Android");
        hss.add("Kotlin");
        System.out.println(hss);
        System.out.println("The size of the string hash set is: "+hss.size());
        boolean obj1 = hss.contains("Java");
        System.out.println("Containing the word java: "+obj1);
        System.out.println("Containing the word Flutter: "+hss.contains("Flutter"));

//########        iterator()	Used to return an iterator over the element in the set.
        for (String s : hss){
            System.out.print(s+" ");
        }

//########        isEmpty()	Used to check whether the set is empty or not. Returns true for empty and false for a non-empty condition for set.
        boolean checkEmpty = hss.isEmpty();
        System.out.println("\nIs hash set hss empty: "+ checkEmpty);

//########        clone()	Used to create a shallow copy of the set.
        Object has = hss.clone();
        System.out.println(has);

//########         remove(Object o)	Used to remove the element if it is present in a set.
        hss.remove("Flutter");
        System.out.println("\nAfter removed the element Flutter from the hash set (hss): \n"+ hss);
    }
}
