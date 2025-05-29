
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		StudentManagementSystem SM = new StudentManagementSystem();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n=== Menu ===");
		    System.out.println("1. Add Student");
		    System.out.println("2. Show All Students");
		    System.out.println("3. Search Student by ID");
		    System.out.println("4. Exit");
		    System.out.print("Choose option: ");
		    int choice = sc.nextInt();
		    sc.nextLine();
		    
		    switch(choice) {
		        
		    case 1  :
		    	SM.addStudent(sc);
		    	break;
		    case 2 :
		    	SM.showStudent();
		    	break;
		    case 3 :
		    	SM.searchStudent(sc);
		    	break;
		    case 4:
		    	System.out.println("Are you sure want to exit(Yes/No) :");
		    	String confirm = sc.nextLine();
		    	
		    	if(confirm.equals("Yes")) {
		    		System.out.println("Exiting...");
		    		return;
		    	}
		    	else {
		    		System.out.println("Back to Menu");
		    	}
		    	break;
		     default:
		    	System.out.println("Invalid Option");
		    	
		    }
		}
		
		
		
		
	}

}
