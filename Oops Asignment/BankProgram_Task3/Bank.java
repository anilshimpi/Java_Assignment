package BankProgram;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer ct = new Customer();
		ct.custmoerdetails();
		System.out.println("Customer Details:");
		ct.Customerdisplay();
		
		System.out.println("Enter Branch Details: ");
		Branch branch= new Branch();
		branch.branchdetails();
		System.out.println("Branch Details: ");
		branch.displayBranchDetails();
		
		Customer_Acc_statement smt=new Customer_Acc_statement();
		smt.customerAccstatement();
		System.out.println("Customer Acount Statement details: ");
		smt.displayCustomerAccStatement();
		
		
	}

}
