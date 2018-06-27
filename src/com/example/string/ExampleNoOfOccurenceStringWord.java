package com.example.string;

import java.util.HashMap;
import java.util.Map;

public class ExampleNoOfOccurenceStringWord {

	public static void main(String[] args) {
		
		
		/*String text = "mass malli mass mallikarjunarao thulluru rao mass malli";
		    String[] words=text.split(" ");
		    System.out.println(" no of words in String: "+words.length);
		    
		    Map<String,Integer> m=new HashMap();
		    for(String s:words) {
		    Integer value=m.get(s);
		    value=(value==null)? 1: ++value;
		    m.put(s, value);
		    }

		    System.out.println(m);*/
		
		
		String s1=new String("abc");
		String s2=new String("abc");
		
		
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2);
	System.out.println(s1.hashCode()+" ========  "+s2.hashCode());
	}

}
