package collectionsDemo;

import java.util.HashMap;
import java.util.Map;


public class HashmapDemo {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	public void addData() {
		map.put(1, "Bhavana");
		map.put(2, "Satya");
		map.put(3, "Harshitha");
		map.put(4, "Rajini");
		
	}
	public void readData() {
		for(Map.Entry<Integer, String> mp:map.entrySet()){
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashmapDemo hashmapdemo = new HashmapDemo();
		hashmapdemo.addData();
		hashmapdemo.readData();
	}
}

