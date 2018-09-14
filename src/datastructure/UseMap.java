package datastructure;

import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;

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
		List<String> firstname=new LinkedList<>();
		firstname.add("ahmed");
		firstname.add("fahim");
		firstname.add("nasir");
		List<String> nickname=new LinkedList<>();
		nickname.add("setu");
		nickname.add("fahimapa");
		nickname.add("nasiranty");
		Map<String, List<String>> call= new HashMap<String, List<String>>();
		call.put("firstname",firstname);
		call.put("nickname is :",nickname);
		for (Map.Entry<String,List<String>> place : call.entrySet()){
			System.out.println("information:" +place.getKey()+" : "+place.getValue());
		}
		//using iterator
		Iterator it=call.entrySet().iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}

		ConnectToMongoDB connectToMongoDB=new ConnectToMongoDB();
	}

}
