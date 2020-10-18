
public class Task {

	public static void main(String[] args) {
		
    boolean diploma = true;
    Double gpa = 3.8;
    
    if(diploma) {//if user has diploma we do further check of gpa
    	
    	
    	System.out.println("congratulations!");
    	
    if(gpa>=3.5) {
    	System.out.println("You are eligiable for scholarship");
    } else {
    	System.out.println("You should've studied harder");
    }
    
    } else {
    	System.out.println("You should get a diploma");
    }
    
    
    
    
	}

}
