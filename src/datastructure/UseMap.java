package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> BD=new LinkedList<>();
		BD.add("RANGPUR");
		BD.add("DHAKA");
		BD.add("RAJSHAHI");
		List<String> USA=new LinkedList<>();
		USA.add("NEWYORK");
		USA.add("CHICAGO");
		USA.add("OHIO");
		Map<String, List<String>> location= new HashMap<String, List<String>>();
		location.put("City of BD",BD);
		location.put("City of USA",USA);
		for (Map.Entry<String,List<String>> place : location.entrySet()){
			System.out.println("output:" +place.getKey()+" : "+place.getValue());
		}
		Iterator it=location.entrySet().iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}

	}

}
