package collectionsDemo;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapDemo {
	LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
	//Linked Hash Map actually follow order when you insert null value
	public void addData() {
		map.put(1, "Bhavana");
		map.put(2, "Satya");
		map.put(3, "Harshitha");
		map.put(4, "Rajini");
		map.put(3, "kuchipudi");// it override previous value
		map.put(null, "null");// it doesn't follow order of value insertion
		
	}
	public void readData() {
		for(Map.Entry<Integer, String> mp:map.entrySet()){
//data type Map.Entry<Integer, String> object - mp map.entrySet()-- giving you back entry objects
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		System.out.println(map.get(1));
		System.out.print(map.containsKey(5));
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMapDemo hashmapdemo = new LinkedHashMapDemo();
		hashmapdemo.addData();
		hashmapdemo.readData();
	}
}

