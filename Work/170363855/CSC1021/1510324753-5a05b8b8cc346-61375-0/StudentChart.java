public class StudentChart {

	
	public int modulemarks2[];// These are the public arrays that are used throughout the code and need
	static int result[] = new int[6];  // to be accessed in different classes hence why they they need to be global instead of local.

	public StudentChart(int[] modulemarks2) {// This method declares the array from a different class so it can be used easily. 
		this.modulemarks2 = modulemarks2;

}

	public void draw() {// This is the method which produces a bar chart corresponding to the values in the array "modulemarks" the two axis
		//bars "x" and "y" are the same through each run. The b bars are looped 6 times creating the six individual bars from the different values in the array.
		//The next part changes the colour of the bar depending on the value of the array and this will correspond to if the have a first class pass,
       //pass, compensatable fail or fail. This uses the same number system in compute result method to create a result array which will
		//the used in the next method 
	
		Bar x = new Bar();
		x.makeVisible();
		x.changeSize(125, 5);
		x.changeColour(Colour.BLACK);
		x.moveVertical(125);

		Bar y = new Bar();
		y.makeVisible();
		y.changeSize(5, 125);
		y.changeColour(Colour.BLACK);
		
		for (int o = 0; o < 6; o = o + 1) {
			Bar b = new Bar();
			b.makeVisible();
			b.changeSize(15, modulemarks2[o]);
			b.moveHorizontal(o * 20 + 10);
			b.moveVertical(125 - modulemarks2[o]);

			
		
			if (modulemarks2[o] >= 70) {

				b.changeColour(Colour.MAGENTA);
				result[o] += 2;
			} else {
				if (modulemarks2[o] >= 40) {
					result[o] += 1;
					b.changeColour(Colour.GREEN);
				} else {

					if (o == 1) {
						result[o] += -400;
						b.changeColour(Colour.RED);
					} else {
						if (modulemarks2[o] >= 35) {
							result[o] += 0;
							b.changeColour(Colour.YELLOW);
						} else {
							result[o] += -400;
							b.changeColour(Colour.RED);
							;
						}
					}
				}
				}
		}			
	}

	
		
	

	public void printSummary(){// This is the method which will produce the table needed after the bar chart. This table shows the module, marks obtained and
	     //your overall result of the module using the result array. As stated earlier it uses the same number system as compute results to determine the 
		//overall result.
		

		
	    System.out.println("Module  |  Marks  | Result");
		System.out.println("--------|---------|-------");
		for (int i = 0; i < 6; i = i + 1) {

			System.out.print("CSC102" + (1 + i) + " |  " + modulemarks2[i] + "     |  ");
            if (result [i] == 2){
			System.out.println("First Class Pass");
		}else{
			if (result [i] == 1){
				System.out.println("Pass");
			}else{
				if (result [i] == 0){
					System.out.println("Compensatable Fail");
				}else{
					if (result [i] == -400){
						System.out.println("Fail");
				}
			

	}
			}
		}
		}
	}
}
