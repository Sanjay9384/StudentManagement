

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
	private ArrayList<Student> students= new ArrayList<>();
	
	public void addStudent(Scanner sc) {
		
		System.out.println("How many students need to add : ");
		int count = sc.nextInt();
		
		for(int i = 1; i <= count; i++) {
			System.out.println("Enter the Id : ");
			int id = sc.nextInt();
			sc.nextLine();
			
			 System.out.print("Enter Student Name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter Student Age: ");
		        int age = sc.nextInt();
		        sc.nextLine();

		        System.out.print("Enter Student Department: ");
		        String dept = sc.nextLine();
		        
		        Student student = new Student(id, name, age, dept);
		        students.add(student);
		        
		        System.out.println("Student Added Successfully!");
		}
		
		
	}
	
	public void showStudent() {
		
		if(students.isEmpty()) {
			System.out.println("No Student in the list");
		}
		else {
			//To Show all Records
			for(Student s : students) {
				
				System.out.println(s+"\n");
		}
		
	}
			
	}
	
	public void searchStudent(Scanner sc) {
		 System.out.print("\n Enter student ID to search: ");
		    int searchId = sc.nextInt();
		    sc.nextLine();
		    
		    boolean found = false;
		    for(Student s : students) {
		    	if(s.getId() == searchId) {
		    		System.out.println("\n Student Found:");
		            System.out.println("ID: " + s.getId());
		            System.out.println("Name: " + s.getName());
		            System.out.println("Age: " + s.getAge());
		            System.out.println("Department: " + s.getDepartment());
		            found = true;
		            break;
		    	}
		    }
		    if (!found) {
		        System.out.println("❌ Student not found with ID: " + searchId);
		    }
		
	}
}
	
	

