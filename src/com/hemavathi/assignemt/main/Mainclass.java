package com.hemavathi.assignemt.main;

//Main Class

import com.hemavathi.assignment.utilities.EmployeeUtilities;
import com.hemavathi.assignment.employee.Manager;
import com.hemavathi.assignment.employee.Developer;

public class Mainclass {

	public static void main(String[] args) {
		
				 Manager manager = new Manager("Aashif", 25, 50000, "Sales");
			        Developer developer = new Developer("Hema", 22, 75000, "Java");

			        // Utilize EmployeeUtilities
			        EmployeeUtilities utilities = new EmployeeUtilities();

			        System.out.println("Manager Details:");
			        utilities.printEmployeeDetails(manager);

			        System.out.println("\nDeveloper Details:");
			        utilities.printEmployeeDetails(developer);
				

			}


	}
