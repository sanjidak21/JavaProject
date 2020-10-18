package LogicalOperators;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pass;
		double accountBalance=1000;
		Scanner scan=new Scanner(System.in);
		double transferAmount=500;
		System.out.println("Welcome to Sntax Please eneter your password");
		pass=scan.nextLine();
		
		if("pass123".equals(pass) || pass.equals("pass123")) {
			System.out.println("Please enter the emount that you want to transfer");
			transferAmount=scan.nextDouble();
			if(transferAmount>accountBalance) {
				System.out.println("Not enough funds");
			}else {
				System.out.println("Transffered remaining balance" + (accountBalance-transferAmount));

			}
			
			
		}else {
			System.out.println("Sorry try again Invalid credentials");
		}

	}
	
}
