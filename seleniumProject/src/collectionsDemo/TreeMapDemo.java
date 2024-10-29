package collectionsDemo;

import java.util.TreeMap;
import java.util.Map;


public class TreeMapDemo {
	TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	//using TreeMap Demo it can actually take the values order without you giving in order
	public void addData() {
		map.put(1, "Bhavana");
		map.put(2, "Satya");
		map.put(5,"Narayana");
		map.put(3, "Harshitha");
		map.put(4, "Rajini");
		map.put(3, "kuchipudi");// it override previous value
		
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
		TreeMapDemo hashmapdemo = new TreeMapDemo();
		hashmapdemo.addData();
		hashmapdemo.readData();
	}
}

