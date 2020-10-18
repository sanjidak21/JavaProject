
public class NestedIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Asghar";
		String pass="pass123";
		double accountBalance=10.25;
		double transferAmount=8;
		boolean transAllowed=true;
		if (pass.equals("pass123")) {
			System.out.println("Welcome to Syntax bank " + name);
			if (transAllowed) {
				if(transferAmount > accountBalance) {
				System.out.println("Initiating trasfer");
			} else {
				System.out.println("transfer complete");
			}
				
				
			}	else {
				System.out.println("you are not allowed to transfer");
			}
			
			
		} else {
			System.out.println("Invalid credentials please try again");
			
		}

	}

}
