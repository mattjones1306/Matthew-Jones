public class Summary {

	public static void StudentSummary(){ // This method gathers all of the different methods from the classes and gathers them together. 
   
		MarkCalculator.input();
	
	StudentChart markChart = new StudentChart(MarkCalculator.computeMarks());
	MarkCalculator.computeResult();
	markChart.draw();
	markChart.printSummary();
	}
	
	public static void main(String[] args) { // The only main method in the program runs the whole code through Student summary.
		StudentSummary();
		
		
	}
}