package com.cf.javaTasks;

import java.util.*;

public class MapToInt {

	    public static void main(String[] args)
	    {
	  
	        // Creating a list of Strings
	        List<String> list = Arrays.asList("my","java","code","is","here");
	
	        list.stream().mapToInt(str -> str.length()).forEach(System.out::println);
	    }
	}

