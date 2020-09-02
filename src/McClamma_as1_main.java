/* Zackary McClamma
 * CPS 530
 * Assignment 1
 * 8 June 2020 */

import java.util.Random;


/* This is the main method for this project, it includes code used to 
 * test the functionality of the PriorityQueue, in its current state
 * this will throw a EmptyPQException at the end, this is by design
 * to test the EmptyPQException */
public class McClamma_as1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		McClamma_as1_PriorityQueue <Integer, String> pq = new McClamma_as1_MinHeap<Integer, String>();
		
		Random rand = new Random();
		
		
		
		pq.insert(rand.nextInt(1000), "aaa");
		pq.insert(rand.nextInt(1000), "bbb");
		pq.insert(rand.nextInt(1000), "ccc");
		pq.insert(rand.nextInt(1000), "ddd");
		pq.insert(rand.nextInt(1000), "eee");
		pq.insert(rand.nextInt(1000), "fff");
		pq.insert(rand.nextInt(1000), "ggg");
		pq.insert(rand.nextInt(1000), "hhh");
		pq.insert(rand.nextInt(1000), "iii");
		pq.insert(rand.nextInt(1000), "jjj");
		pq.insert(rand.nextInt(1000), "kkk");
		pq.insert(rand.nextInt(1000), "lll");
		
		System.out.println("Min value before Delete: " + pq.findMin());
		System.out.println();
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 1: " + pq.findMin());
		pq.print();
		
		
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 2: " + pq.findMin());
		pq.print();
		
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 3: " + pq.findMin());
		pq.print();
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 4: " + pq.findMin());
		pq.print();
		
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 5: " + pq.findMin());
		pq.print();
		
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 6: " + pq.findMin());
		pq.print();
		
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 7: " + pq.findMin());
		pq.print();
		
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 8: " + pq.findMin());
		pq.print();
		
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 9: " + pq.findMin());
		pq.print();
		
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 10: " + pq.findMin());
		pq.print();
		
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 11: " + pq.findMin());
		pq.print();
		
		
		System.out.println("Deleted: " + pq.deleteMin());
		System.out.println("Min value after Delete 12: " + pq.findMin());
		pq.print();
		
		
	}

}
