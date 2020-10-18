import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter boolean value for rain");
		
		boolean rain=input.nextBoolean();//I  am waiting for your input and then hit ENTER when your done
		
		if(rain) {
			System.out.println("Please take an uembrella");
		}else {
			System.out.println("Its a nice weather go for a walk");
		}
		
		System.out.println("----------- LET'S CAPTURE INTEGER VALUE----------");
		System.out.println("Please enter your name");
		String name=input.nextLine();
				
				System.out.println("Please enter your age");
		int age=input.nextInt();
		
		System.out.println("your name is "+name+" your "+age+" years  old");
		
		
   
	}

}
