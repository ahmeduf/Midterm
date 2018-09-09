package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> movie=new LinkedList<>();
		movie.add("MI:1");
		movie.add("MI:2");
		movie.add("DON");
		movie.add("NUN");
		movie.add("XXX");


		Iterator look=movie.iterator();
 while (look.hasNext()){
	 System.out.println(look.next());

 }
		movie.remove("MI:2");
		movie.peek();
		movie.poll();
		System.out.println();
 for (String looks : movie){
	 System.out.println(looks);
 }


	}

}
