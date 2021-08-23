package Strings_Know;

import java.util.HashMap;

public class Second_most_frequent_letter_correct {

	
	 public Character secondCommon(String str)
	    {
	        Character ans = null;
	        int first = 0, second = 0;
	        HashMap<Character,Integer> counter = new HashMap<>();
	        for(char c: str.toCharArray())
	        {
	            if(!counter.containsKey(c))
	            {
	                counter.put(c,1);
	            }
	            else
	            {
	                counter.put(c,counter.get(c) + 1);
	            }
	        }
	        System.out.println(counter);
	       for (char c: counter.keySet())
	       {
	           if(counter.get(c) > first)
	           {
	               second = first;

	               first = counter.get(c);
	           }
	           else
	               if(counter.get(c) > second && counter.get(c) < first)
	           {
	               second = counter.get(c);
	               ans = c;
	           }
	       }
	        return ans;
	    }

	    public static void main(String[] args) {
	    	Second_most_frequent_letter_correct o = new Second_most_frequent_letter_correct();
	        System.out.println(o.secondCommon("bananassss"));
	    }
	}

