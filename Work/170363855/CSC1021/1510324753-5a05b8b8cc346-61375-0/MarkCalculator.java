import java.util.Scanner;

public class MarkCalculator {

	public static int[] modulemarks = new int[6]; // These are the public arrays that are used throughout the code and need  
	public static int[] exammarks = new int[6];// to be accessed in different classes hence why they they need to be global instead of local.
	public static int[] courseworkmarks = new int[6];
	public static double[] marks1;
	
	public static void input(){ // This is the first part of the code which deals with the user adding the input of integers
		//corresponding to their coursework and exam marks for set modules. As you can see from the start of the code there is
		//the scanner which is called “in”, this scanner allows the program to read the users input into the code so it can be 
		//sorted into the array and calculated later on in the program. In this code I have also set certain parameters for 
		//the user so that they can’t input and values which are over 100 and lower than 0 as these cannot be achieved in any 
		//module and would give false results. For this I display to the user that an unexpected input has been entered and ask
		//them to restart the program. In the example it shows that the “For loop” runs through the exam and coursework marks 
		//6 times alternating the entry so that you enter results from 1 module at a time. Another part in this code which is 
		//needed is that there is only coursework in the module CSC1023, even thought you have to enter and number for exam marks
		//on this module I have added that “exammarks[2]” will always equal 0. 
		
	Scanner in = new Scanner(System.in);

		for (int j = 0; j < 6; j++) {
			System.out.println("Please enter exam marks here for CSC" + (1021 + j));
			if (j == 2) {
				exammarks[2] = 0;
			}

			exammarks[j] = in.nextInt();

			if (exammarks[j] > 100 || exammarks[j] < 0) {
				System.out.println("Unexpected input please restart");
				break;
			}
			System.out.println("Please enter coursework marks here for CSC" + (1021 + j));
			courseworkmarks[j] = in.nextInt();
			if (courseworkmarks[j] > 100 || courseworkmarks[j] < 0) {
				System.out.println("Unexpected input please restart");
				break;
			}

		}
	}

	public static int[] computeMarks() { //In this method the “modulemarks” array is calculated with most of the calculations happening
		//here. First I declared a double array of the coursework weighting which will be used in the “modulemarks”, this is then put
		//through a “For loop” so that the six individual module marks are calculated with there different weighting applied. In the
		//next piece of code the program is capping for compensatable fails where one of the scores is lower then 35 and the other is
		//higher. Here for example CSC1021 exam mark is 45 and the coursework is 34, this is then later capped at 35 as one of the scores
		//is lower then 35. This equals a compensatable fail, however even though CSC1022 is also capped at 35 this is a core module so
		//there is no compensatable fail and the “modulemarks” for this module have to be 40 or higher. At the end of this method calculates
		//if you have passed, failed or had a compensatable fail by looking at the "modulemarks" array.


	
		double[] weighting = new double[6];

		weighting[0] = 0.5;
		weighting[1] = 0.4;
		weighting[2] = 1.0;
		weighting[3] = 0.5;
		weighting[4] = 0.2;
		weighting[5] = 0.33;

		for (int i = 0; i < 6; i = i + 1) {

			modulemarks[i] = (int) Math.round(courseworkmarks[i] * weighting[i] + exammarks[i] * (1 - weighting[i]));
			
		}

		for (int x = 0; x < 6; x = x + 1) {

		
			if (courseworkmarks[x] < 35 && exammarks[x] < 35 || x==2) {
			
		}
			
		else{
			
		
			
			
			if (courseworkmarks[x] < 35 || exammarks[x] < 35){
			if (modulemarks[x] > 35 ){
			modulemarks[x] = 35;
			}
			}
								
					
        
				
			
		}
			System.out.println(modulemarks[x]);

		
			if (modulemarks[x] >= 40) {

				System.out.println("Pass in CSC" + (1021 + x));
			} else {
				if (x == 1) {
					System.out.println("Fail in CSC" + (1021 + x));
				} else {
					if (modulemarks[x] >= 35) {
						System.out.println("Compensatable Fail in CSC" + (1021 + x));
					} else {
						System.out.println("Fail in CSC" + (1021 + x));
					}
				}
			}
		
		}
		
		return modulemarks;
	}

	

	public static void computeResult() {// This method determines what the stage average for all of the modules by adding the individual
		//module marks and divides it by 6. The next part of this code is a system to detect how many pass, fails or, compensatable fails
		//the user has accumulated to give a stage result for the whole year. I have used a number system which gives overall number which
		// is under "j", if they passed a module I add 1 to "j" for a compenstable fail nothing is added or subtracted and finally if there
		//is a fail I subtract 400 from "j". This allows me to determine if there has been a fail because "j" will be under 0 and they fail
		//the year, if the number is 6 they passed all of the modules giving them and overall pass. Furthermore, if the number is 4 or 5
		//they achieve a pass by compensation. The other point about this is that if they get 3 compenstabale fails even if the don't get 1 
		//out right fail they still fail the year. Lastly, if the stage average is lower than 40 and you still only have 2 compensatable
		//fails the stage result is still a fail.


		int[] j = new int[1];

		int stageaverage = ((modulemarks[0] + modulemarks[1] + modulemarks[2] + modulemarks[3] + modulemarks[4]
				+ modulemarks[5]) / 6);

		System.out.println("Your Stage Average is " + stageaverage);
		for (int x = 0; x < 6; x = x + 1) {

			if (modulemarks[x] > 40) {
				j[0] += 1;
			} else {
				if (x == 1) {
					j[0] += -400;
				} else {
					if (modulemarks[x] >= 35) {
						j[0] += 0;
					} else {
						j[0] += -400;
					}

				}
			}
		
		}

		if (j[0] > 5) {
			System.out.println("Stage Result: Pass");
     }       
		else {
			
	    if (j[0] >= 4 && stageaverage > 40){
 	
					 System.out.println("Stage Result: Pass by Compensation"); 
	}
		
		else {
					System.out.println("Stage Result: Fail");
		}
	
		
		}

	}
}



