package hashmapUse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ImplementHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap=new HashMap<Integer, String>();
		hashMap.put(11, "Sanu");
		hashMap.put(10, "Sachin");
		hashMap.put(13, "Sehwag");
		hashMap.put(12, "Dravid");
		hashMap.put(14, "Pikachu");
		hashMap.put(8, "Cena");
		
		
		System.out.println(hashMap.get(12));
		
		System.out.println("=====================================================");
		
		for(HashMap.Entry<Integer,String> entry: hashMap.entrySet())
		{
			System.out.println("Key= "+entry.getKey()+" Value= "+entry.getValue());
		}
		
		hashMap.clear();
		hashMap.put(11, "Sanu");
		hashMap.put(10, "Sachin");
		hashMap.put(13, "Sehwag");
		hashMap.put(12, "Dravid");
		hashMap.put(14, "Pikachu");
		hashMap.put(8, "Cena");
		
System.out.println("=====================================================");
		
		for(HashMap.Entry<Integer,String> entry: hashMap.entrySet())
		{
			System.out.println("Key= "+entry.getKey()+" Value= "+entry.getValue());
		}
		System.out.println("=====================================================");
		
		System.out.println(hashMap.size());
		
System.out.println("=====================================================");
		
		System.out.println(hashMap.keySet());
		
System.out.println("=====================================================");
		
		System.out.println(hashMap.values());
		
		
		/*hashMap.clear();
		
System.out.println("=====================================================");*/
		
		System.out.println(hashMap.size());
		
		System.out.println("=====================================================");
		
		    List<String> mapValues = new ArrayList<String>(hashMap.values());
		    Collections.sort(mapValues);
		    for(String sortVal:mapValues)
		    {
		    	System.out.println(sortVal);
		    }
		    
			System.out.println("=====================================================");
		    MyInteger num=new MyInteger(5);
		    MyInteger num1=new MyInteger(21);
		    MyInteger num2=new MyInteger(2);
		    MyInteger num3=new MyInteger(6);
		    MyInteger num4=new MyInteger(3);
		    MyInteger num5=new MyInteger(88);
		    HashMap<MyInteger,String> customHashMap=new HashMap<>();
		    customHashMap.put(num, "sanu");
		    customHashMap.put(num1, "Sachin");
		    customHashMap.put(num2, "Sehwag");
		    customHashMap.put(num3, "Dravid");
		    customHashMap.put(num4, "Cena");
		    System.out.println("=====================================================");
		    for(Entry<MyInteger, String> entry: customHashMap.entrySet())
			{
				System.out.println("Key= "+entry.getKey().getKey()+" Value= "+entry.getValue());
			}
		    System.out.println("=====================================================");
		    List<MyInteger> mapKeys = new ArrayList<MyInteger>(customHashMap.keySet());
		    Collections.sort(mapKeys);
		    for(MyInteger sortVal:mapKeys)
		    {
		    	System.out.println(sortVal);
		    }

	}

}
