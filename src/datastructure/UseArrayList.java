package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
List<String> exam =new ArrayList<>();
exam.add("SIDDIQ");
exam.add("AHMED");
exam.add("NASIR");
exam.add("FAHIM");
exam.add("FARZAD");

        System.out.println(exam);
        exam.remove(1);
        System.out.println(exam);

        for (String abc : exam){
            System.out.println(abc);
        }

        System.out.println();
        Iterator abc=exam.iterator();
        while (abc.hasNext()){

            System.out.println(abc.next());
        }

	}

}
