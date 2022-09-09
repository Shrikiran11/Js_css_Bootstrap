package com.cf.javaTasks;
import java.util.*;
public class MapToDouble {
	
		    public static void main(String[] args)
		    {
		  
		        // Creating a list of Strings
		        List<Integer> list = Arrays.asList(9,8,7,6,5);
		
		        list.stream().mapToDouble(i->i/3.0).forEach(System.out::println);
		    }
		}


