package examples.practice.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

    public static void main(String[] args) {

//        CREATING A QUEUE USING THE LINKED LIST   ##############################################
        Queue<String> q = new LinkedList<>();
        System.out.println("Queue elements: "+q);
//        ADDING THE ELEMENTS IN THE QUEUE
        q.add("java");
        q.add("Kotlin");
        q.add("Android");
        q.add("ble");
        q.add("IoT");
        System.out.println(q);
        for (String i  : q){
            System.out.print(i+" ");
        }

        String front = q.remove();
        System.out.println("\nThe removed element is: "+front);
        System.out.println(q);

        String removeElement = q.remove();
        System.out.println("\nThe removed element is: "+removeElement);
        System.out.println(q);

        q.add("date");
        System.out.println("\nQueue after the date element is added: "+q);

        String peeked = q.peek();
        System.out.println("\nThe peeked element is: "+peeked);
        System.out.println("Queue after peeked: "+q);

//        Create a queue and add the INTEGER-TYPE elements using for loop ############

        Queue<Integer> qi = new LinkedList<>();

        for (int i = 0; i< 5; i++){
            qi.add(i);
        }
        System.out.println("The queue after the elements has been added: "+qi);
//        Remove the head of the queue
        int removeHead = qi.remove();
        System.out.println("\nThe element removed is : "+removeHead);
        System.out.println("Queue after the head is removed: "+qi);
        System.out.println(qi.poll());
        System.out.println(qi);

//        CHECK THE SIZE OF THE QUEUE
        int queueSize = qi.size();
        System.out.println("\nThe size of the queue is: "+queueSize);

//        Creating a queue using PRIORITY QUEUE and add the elements  #####################################################

        Queue<Character> qc = new PriorityQueue<>();
        qc.add('a');
        qc.add('m');
        qc.add('e');
        qc.add('k');
        qc.add('z');
        qc.add('e');
        qc.add('k');
        qc.add('a');
        qc.add('a');
        System.out.println("The size of the queue before the element is removed: "+qc.size());
        System.out.println(qc);

        qc.remove('a');
        System.out.println("Queue after the 'a' is removed");
        System.out.println(qc);
        System.out.println("The size of the queue after the element is removed: "+qc.size());
        System.out.println("\n peek element: "+qc.peek());
        System.out.println(qc);
        qc.remove('a');
        System.out.println(qc);
        System.out.println(qc.peek());
        System.out.println(qc);
        System.out.println(qc.poll());
        System.out.println(qc);
        System.out.println(qc.poll());
        System.out.println(qc);
        System.out.println(qc.poll());
        System.out.println(qc);
        System.out.println(qc.poll());
        System.out.println(qc);
        System.out.println(qc.poll());
        System.out.println(qc);
        System.out.println(qc.peek());

//        Iterating the Queue  ######################
        Queue<String> pq = new PriorityQueue<>();
        pq.add("Geeks");
        pq.add("for");
        pq.add("Geeks");
        pq.add("studio");
        System.out.println("\n The values of queue are:  "+pq);
        Iterator<String> iterator = pq.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }

        System.out.println("\n");

        for (String s : pq){
            System.out.print(s+" ");
        }

        pq.remove("for");
        System.out.println("\n"+pq);


    }
}
