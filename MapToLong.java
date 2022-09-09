package com.cf.javaTasks;

import java.util.Arrays;
import java.util.List;

public class MapToLong {
	  public static void main(String[] args)
	    {
	  
	        // Creating a list of Strings
	        List<Integer> list = Arrays.asList(9,8,7,6,5);
	
	        list.stream().mapToLong(i->i*500000000).forEach(System.out::println);
	    }

}
