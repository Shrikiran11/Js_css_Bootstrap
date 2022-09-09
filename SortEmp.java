package com.cfstreams;

import java.util.Comparator;

public class SortEmp {


	public static void main(String[] args) {
	System.out.println("List of names sorted by First Name");
	Comparator<Employee> empComparator= ( emp1,emp2) -> emp1.getFirstName().compareTo(emp2.getFirstName());
	EmployeeRepository.getEmployees().stream().sorted(empComparator.reversed()).forEach(System.out::println);
	Comparator<Employee> empComparator2= ( emp3,emp4) -> (int)(emp3.getSalary().compareTo(emp4.getSalary()));
	EmployeeRepository.getEmployees().stream().sorted(empComparator.reversed()).forEach(System.out::println);
}

}
