package collectionsdemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// Create a Priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)--store data in ascending order
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);
        
// try to insert data using offer()
        
numbers.offer(80);   
numbers.offer(2000);   
System.out.println("Head Element :"+numbers.peek());
        // poll/Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }
       
	}

}
