
public class Nested {
	public static void main(String[] args) {
		
  /*
   * variable for allergy -yes or no
   *
   * if allergy is yes -->
   *         we will check if pet allergy
   *         if peanut allergy
   *         if pollen allergy
   * if no allergy you are lucky !!!
   */
		
	boolean allergy=true;
	
	boolean petAllergy=false;
	
	
			
	
	if (allergy) {//true
		
		System.out.println("Lets do further check");
		
		if(petAllergy) {
			System.out.println("Please no cats or dogs on the house");
		}else {
			System.out.println("This is good you do not have pet allery");
		}
		
		
	}else {
		System.out.println("You are lucky");
	 }
	
	System.out.println("---------EXAMPLE 2-------------");
	
	boolean isFriday = true;
	int date = 14;
	boolean monday=false;
	
	if(isFriday) {
		
    if(date==13) {
		System.out.println("I will watch a movie");
    }else {
			System.out.println(" I will watch PK movie with Amir Khan");
		}
	}else {
		
	if(monday) {
		System.out.println("I am not studying, I am working");	
		}else {
		  System.out.println("I have class at Syntax");
	  }
	
	 }
	
	
	
	
	
	System.out.println("---------EXAMPLE 2-------------");
	
	/* check if assignment is completed
	 * id assignment is completed:
	 *        if score is > 90 --> great job
	 *        if score is > 80 --> good job
	 *        if score >70 --> please study more
	 *
	 *
	 */
	 
	//debug your code  layer and analyze what is the  issue!!!
	//do not make that mistake !!!!!!!!
	
	
	int score =85;
	boolean assignment =true;
	
	if (assignment) {
		
		if(score>90) {
		  System.out.println("You did great!!!!");		
	}else if (score >80) {
		System.out.println("You did good!!!!!");
	}else if (score >70) {
		System.out.println("Probably you need to study more");
	}else {
		System.out.println("Good job for trying but you must study");
	}
		
	}else {
		
		
		System.out.println("You should always complete all assignments");
		
	}
 }
}	