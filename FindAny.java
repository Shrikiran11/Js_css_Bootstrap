package com.cf.javaTasks;

import java.util.*;
import java.util.stream.Stream;
import java.util.OptionalInt;
import java.util.stream.IntStream;
class FindAny {
	
	    // Driver code
	    public static void main(String[] args) {
	          
	    // Creating an IntStream
	    IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16)
	                       .parallel();
	      
	    stream = stream.filter(i -> i % 2 == 0);
	  
	    OptionalInt answer = stream.findAny();
	    if (answer.isPresent()) 
	    {
	        System.out.println(answer.getAsInt());
	    }
	
	}
}
