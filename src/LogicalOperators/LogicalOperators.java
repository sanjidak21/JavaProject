package LogicalOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day="Sunday";
		if(day.equalsIgnoreCase("Sunday")) {
			System.out.println("Relax its weekend just don't blink");
			
		} else if(day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax its weekend just din't blink or it will be over");
			
		} else {
			System.out.println("Go to work");
		}

		if(day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax its weekend just din't blink or it will be over");
			
		} else {
			System.out.println("Go to work");
		}
	}

}
