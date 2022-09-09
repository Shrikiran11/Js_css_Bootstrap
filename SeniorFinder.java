package com.cfstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SeniorFinder {

	public static void main(String[] args) {
		ArrayList<Employee> elist=(ArrayList<Employee>) EmployeeRepository.getEmployees();
		Stream<Employee> emps= elist.stream();
		
		 Optional<Employee> person = emps.max(Comparator.comparing(Employee::getHireDate));

			    if (person.isPresent()) {
			      System.out.println("Oldest Employee: " + person.get().getFirstName()+" "+person.get().getLastName()+" "+person.get().getHireDate());
			    } else {
			      System.out.println("Could not  get   the   oldest employee.");
			    }

	}

}
