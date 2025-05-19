package examples.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        System.out.println(li);

//        ADDING ELEMENTS IN THE ARRAY
        li.add("Extel");
        li.add("Endo0r");
        li.add("Studio");
        li.add("java");
        li.add("ble");
        li.add("iot");
        System.out.println("Elements of the list are");
        for (String s : li){
            System.out.println(s);
        }

//        GET LIST ELEMENTS BY USING THE INDEX NUMBER
        System.out.println(li.get(2));

//        ADDING THE ELEMENT IN THE LIST AT A PARTICULAR LOCATION
        li.set(1, "Endorphins");
        System.out.println(li);

        li.add("Shadow");
        System.out.println(li);

//        REMOVE THE ELEMENT FROM THE LIST
        li.remove(1);
        System.out.println(li);

        li.remove("kasap0");
        System.out.println(li);

        li.remove("Studio");
        System.out.println(li);

        System.out.println(li.get(1));

        li.add("Studio");
        System.out.println(li);

        li.add("Endorphins");
        System.out.println(li);

        for (String s : li) {
            System.out.println(s);
        }

        li.add(1,"Android");
        System.out.println(li);

        System.out.println("The element ate the index 3 is: "+li.get(3)); // SEARCHING
        System.out.println(li+"\n");

        li.remove(3);
        System.out.println("Removing the element at the index 3: \n"+li );

//        ACCESSING THE ELEMENTS


        String first = li.get(0);
        String second = li.get(1);
        String third = li.get(2);
        String fourth = li.get(3);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

//        CHECKING IF ELEMENT IS PRESENT OR NOT
        boolean isPresent = li.contains("Android");
        if (isPresent){
            System.out.println("The element is present");
        }else {
            System.out.println("The element is not present");
        }

        li.add("java");
        System.out.println(li);
        li.add("ble");
        System.out.println(li);
        li.add("iot");
        System.out.println(li);

//        ITERATION

        for (int i = 0; i<li.size(); i ++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println("\n");
        for(String j : li){
            System.out.print(j+", ");
        }

//        DUPLICATE VALUES
        li.add("java");
        li.add("java");
        li.add("kotlin");
        li.add("kotlin");
        System.out.println("\n\n"+li);
        li.clear();
        System.out.println("\n\nAll the elements are cleared: "+ li);
    }
}
