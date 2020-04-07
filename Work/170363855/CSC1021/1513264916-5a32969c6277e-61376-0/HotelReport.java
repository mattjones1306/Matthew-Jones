package Project2;

public class HotelReport {
	/*
	 * This class is used to present the variables which are stored in the lists
	 * into a neat report using a table. Here all of the information given is
	 * displayed.
	 */
	public void display(Hotel hotel) {
		System.out.println("|                             Your Hotel                          |");
		System.out.println("|/////////////////////////////////////////////////////////////////|");
		/*
		 * These lines of code display the top of the table.
		 */
		System.out.println("| The Hotel's Name: " + hotel.getName());
		/*
		 * These lines of code display the hotels name using the getName method
		 * in the Hotel class.
		 */
		System.out.println("| How many rooms are there: " + hotel.getRoomsList().size());
		/*
		 * These lines of code display the number of rooms there are using the
		 * getRoomsList method in the Hotel class.
		 */
		for (int x = 0; x < hotel.getRoomsList().size(); x = x + 1) {
			int j = x + 1;
			/*
			 * This variable is used to correct the room number problem which
			 * occurred in the HotelTest class.
			 */

			System.out.println(
					"| How many beds are in room " + j + ": " + hotel.getRoomsList().get(x).getBedsList().size());
			/*
			 * These lines of code display the number beds in a room using the
			 * getRoomsList method in the Hotel class and the getBedsList in the
			 * Room class.
			 */
			System.out.println("| What beds are there: " + hotel.getRoomsList().get(x).getBedsList().toString());
			/*
			 * These lines of code display the type of beds in a room using the
			 * getRoomsList method in the Hotel class and the getBedsList in the
			 * Room class. It also uses the toString method which was made in
			 * the Bed class to print out the string.
			 */
		}
		System.out.println("| The total occupancy at " + hotel.getName() + " is: " + hotel.getOccupancy());
		/*
		 * These lines of code display the occupancy using the getOccupancy
		 * method in the Hotel class.
		 */
		System.out.println("| The vacancy at " + hotel.getName() + " is: " + hotel.getHasVacancy());
		/*
		 * These lines of code display the vacancy using the getHasVacancy
		 * method in the Hotel class.
		 */
	}
}