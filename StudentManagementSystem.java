
import java.util.ArrayList;
import java.util.Iterator;
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
		        System.out.println("X Student not found with ID: " + searchId);
		    }
		
	}
	
	public void updateStudent(Scanner sc) {
		System.out.println("Enter the Id of the student : ");
		int updateId = sc.nextInt();
		sc.nextLine();
		
		for(Student s: students) {
			if(s.getId() == updateId) {
				System.out.println("Which field needs to update \n1. Name\n2.Age\n3.Department");
				int updateDetails = sc.nextInt();
				String name = s.getName();
				int age = s.getAge();
				String dept =s.getDepartment();
				sc.nextLine(); 
				
				switch(updateDetails) {
				case 1:
					System.out.print("Enter new Name: ");
			         name = sc.nextLine();
			        s.setName(name);
			        System.out.println("Updated sucessfully!");
			        break;
			     
				case 2:
					 System.out.print("Enter Student Age: ");
				       age = sc.nextInt();
				      sc.nextLine();
				      System.out.println("Updated sucessfully!");
				      s.setAge(age);
				      break;
				case 3:
					System.out.print("Enter Student Department: ");
			         dept = sc.nextLine();
			         System.out.println("Updated sucessfully!");
			        s.setDepartment(dept);
			        break;
			    default:
			    	System.out.println("Invalid Option to update!");
			    	break;   
				}
				
				
				
			}
			else {
				System.out.println("No Student not found");
			}
		}
		
		
		
	}
	
	public void deleteStudent(Scanner sc) {
		System.out.println("Enter the Id of the student which you need to delete : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		 boolean found = false;
		    Iterator<Student> iterator = students.iterator();  // students is your ArrayList

		while (iterator.hasNext()) {
	        Student s = iterator.next();
	        if (s.getId() == id) {
	            iterator.remove();  // Safe removal inside loop
	            found = true;
	            System.out.println("✅ Student deleted successfully!");
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("❌ Student with ID " + id + " not found.");
	    }
		
		
	}
}
	
	

