package com.example.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleHashMapEquality {

	public static void main(String[] args) {
		
		
		Map<String, Integer> Map1 = new HashMap<>();
	    Map1.put("a", 1);
	    Map1.put("b", 2);
	    Map1.put("c", 3);
	    Map1.put("d", 4);
	    Map<String, Integer> Map2 = new HashMap<>();
	    Map2.put("a", 1);
	    Map2.put("b", 5);
	    Map2.put("c", 3);
	    Map2.put("d", 4);
	    Map2.put("e", 6);
	    Map2.put("f", 9);
	   /* // check if all keys from Map1 are present in Map2
	    System.out.println(Map2.keySet().containsAll(Map1.keySet()));
	    
	    //System.out.println(Map1.keySet().retainAll(Map2.keySet()));
	    System.out.println(Map1.keySet().equals(Map2.keySet()));*/
	    
	    /*
	    for(Entry<String, Integer> entry:Map1.entrySet()) {
	    	String key=entry.getKey();
	    	System.out.println(key+"============== "+entry.getValue().equals(Map2.get(key)));
	    	
	    }*/
	    
	   Set<String> firstmap= Map1.keySet();
	    for(String s:firstmap) {
	    	Integer value=Map1.get(s);
	    	//System.out.println(s+" ==========  "+value);
	    	System.out.println(s+" =========== "+value.equals(Map2.get(s)));
	    }

	}

}
