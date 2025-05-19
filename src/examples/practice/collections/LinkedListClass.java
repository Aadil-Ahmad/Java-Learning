package examples.practice.collections;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args){

        LinkedList<String> lls = new LinkedList<>();
        lls.add("Android");
        lls.add("Compose");
        lls.add("Flutter");
        lls.add("Kotlin");
        System.out.println(lls);

        lls.add(3, "Java");
        System.out.println(lls);

        lls.remove();
        System.out.println(lls);

        List<String> ls = new ArrayList<>();
        ls.add("Ftm");
        ls.add("Ble");
        ls.add("IoT");
        System.out.println("The elements of the List are: "+ ls);

        lls.addAll(ls);
        System.out.println("Linked List after the list items are added: "+lls);

        lls.addFirst("Studio");
        System.out.println("After the element Studio added at the first position: "+lls);
        lls.addLast("Endorphins");
        System.out.println("The element Endorphins has added at the last: "+lls);

        boolean contains = lls.contains("aadar");
        System.out.println("Is element aadar is in the linked list: "+contains);
        boolean containsNew = lls.contains("Android");
        System.out.println("Is element Android is in the linked list: "+contains);

        System.out.println("The first element is: "+ lls.getFirst());
        System.out.println("The first element is: "+ lls.getLast());

        System.out.println("The index of element Java: "+lls.indexOf("Java"));
        System.out.println(lls);

        System.out.println("Peek the linked list: "+lls.peek());
        System.out.println(lls);
        System.out.println("Peek the First and the Last Element 1: "+lls.peekFirst()+" 2: "+lls.peekLast());
        System.out.println("Using the pool method: "+lls.poll());
        System.out.println(lls);
        System.out.println("Pool the First and the Last element 1: "+lls.pollFirst()+" 2: "+lls.pollLast());
        System.out.println(lls);
        System.out.println("The size of the linked list is: :"+lls.size() );
        lls.set(1,"Compose");
        System.out.println("Linked list after changing the element at index 1: "+lls);

//        ITERATING LINKED LIST

        System.out.println("\n");
        for (int i = 0; i< lls.size(); i++){
            System.out.print(lls.get(i)+ " ");
        }
        System.out.println("\n");
        for (String i : lls){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("The element at the index 2 is: "+lls.get(2));


//        INTEGER TYPE LINKED LIST
        LinkedList<Integer> lli = new LinkedList<>();
        lli.add(124);
        lli.add(958);
        lli.add(111);
        lli.add(325);
        lli.add(756);
        System.out.println(lli);
        for (int i : lli){
            System.out.print(i+" ");
        }

//        convert a linked list into an array
        Object[] a = lli.toArray();
        System.out.println(a);
        System.out.println("\n\nAfter converting the linked list into an array");
        for (Object element : a ){
            System.out.print(element+" ");
        }
    }
}
