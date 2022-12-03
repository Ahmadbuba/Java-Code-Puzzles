package assignment_02;

import ignore.TestingUtils;

public class App {

	
	/**
	 * You are driving a little too fast, and a police officer stops you. 
	 * Write code to compute the fine you would have to pay. 
	 * If your speed is 60 or less, the result is 0 since there is no fine. 
	 * If speed is between 61 and 80 inclusive, the fine is 100 dollars. 
	 * If speed is 81 or more, the result is 200. 
	 * Unless it is a holiday -- on that day, your speed can be 5 higher in all cases. <br>
	 * <br> 
	 *
	 * <b>EXPECTATIONS:</b><br>
		speedingFine(60, false)  <b>---></b> 0 <br>
		speedingFine (65, false)   <b>---></b> 100 <br>
		speedingFine (65, true) <b>---></b> 0 <br>
	 */
	
	
	
	// My Method
//		public static int speedingFine(int speed, boolean isHoliday) {
//			int tax = 0;
//			if(isHoliday == false) {
//				
//				if ((speed >= 61) && (speed <= 80)) {
//						tax = 100;
//						
//				} else if (speed > 80) {
//						tax = 200;
//				}
//				
//			} else {
//				
//				if((speed >= 66) && (speed <= 85)) {
//					tax = 100;
//				} else if (speed > 86) {
//					tax= 200;
//				}
//				
//			}
//			
//			return tax;
//
//		}
	
	public static int speedingFine(int speed, boolean isHoliday) {
		int minSpeed = 60;
		int maxSpeed = 80;
		int fine = 0;
		
		if (isHoliday) {
			minSpeed+=5;
			maxSpeed+=5;
		}
		
		if(speed > minSpeed && speed <= maxSpeed) {
			fine = 100;
		}
		
		if(speed >= maxSpeed) {
			fine = 200;
		}
		
		return fine;
		
	}
		
	
	
	
	
	
	
	
	
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
		public static void main(String args[]){
			TestingUtils.runTests();
		}
			

}
