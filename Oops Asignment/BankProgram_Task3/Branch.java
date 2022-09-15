package BankProgram;

import java.util.Scanner;

public class Branch {
	
	int branch_id;
	String branch_name;
	String branch_address;
	
	void branchdetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter branch Id: ");
		branch_id=sc.nextInt();
		System.out.println("Enter branch Name: ");
		branch_name=sc.nextLine();
		System.out.println("Enter branch Adress: ");
		branch_address=sc.nextLine();
		
		
	}
	
	public void displayBranchDetails() {
		
		System.out.println("Branch Id: "+branch_id);
		System.out.println("Branch name: "+branch_name);
		System.out.println("Branch Address: "+branch_address);
	}

}
