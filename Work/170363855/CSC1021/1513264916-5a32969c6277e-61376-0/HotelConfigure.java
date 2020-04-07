package Project2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelConfigure {
	/*
	 * This class is where the user would input of of the details regarding
	 * their hotel. This class is similar to hotel test except these all rely on
	 * a users input.
	 */
	public static void main(String[] args) {
		HotelReport hotelRP = new HotelReport();
		/*
		 * This is creating a instance of the class which is needed to be
		 * accessed in this following code.
		 */
		int rooms = 0;
		int beds = 0;
		String sbed;
		int occupancy = 0;
		String vacancy;
		int vacancy2 = 0;
		/*
		 * These are the variable which are used in the class before being set
		 * in the corresponding getter and setter methods in the other classes.
		 * All of the integers have also been initialise at 0.
		 */

		Scanner in = new Scanner(System.in);
		/*
		 * This scanner reads the input from the user.
		 */
		System.out.println("What is the name of the hotel?");
		String hotel = in.nextLine();
		Hotel hotelR = new Hotel(hotel);
		hotelR.setName(hotel);
		/*
		 * These lines of code ask the user to enter the name of their hotel,
		 * reads what the user inputs and uses the the setName method in the
		 * Hotel class and sets the name to the users input.
		 */
		System.out.println("How many rooms are there at the Hotel");
		rooms = in.nextInt();
		for (int j = 0; j < rooms; j = j + 1) {
			hotelR.addRooms(j);

			/*
			 * These lines of code ask the user how many rooms there are at the
			 * hotel, reads the input and creates the same amount of rooms in
			 * the rooms list. This uses the addRooms method in the Hotel class.
			 */
			System.out.println("Is room " + (j + 1) + " vacant? [yes] or [no]");
			vacancy = in.next();
			if (vacancy.equals("yes")) {
				vacancy2 += 1;
			} else if (vacancy.equals("no")) {
			} else
				while (!vacancy.equals("yes") && !vacancy.equals("no")) {
					System.out.println("Please enter a valid answer");
					vacancy = in.next();
				}
			/*
			 * These lines of code calculate the vacancy at the hotel. It does
			 * this by asking the user is the room is vacant every time for each
			 * room. The validation here also prevents people from entering a
			 * wrong value.
			 */

			System.out.println("How many beds are there in room " + (j + 1) + " ?");
			beds = in.nextInt();
			hotelR.getRoomsList().get(j).addBed(beds);
			/*
			 * These lines of code ask the user how many beds there are in each
			 * room there is at the hotel, reads the input and creates the same
			 * amount of beds in the beds list. This uses the addBed method in
			 * the Room class and the getRoomsList method in. The hotel class.
			 */
			for (int i = 0; i < beds; i = i + 1) {
				System.out.println("What are the size of the beds, Double [d] or Single [s]?");
				sbed = in.next();
				hotelR.getRoomsList().get(j).getBedsList().get(i).setsBed(sbed);
				hotelR.getRoomsList().get(j).getBedsList().get(i).addsBed(sbed);
				if (sbed.equals("d")) {
					occupancy += 2;
				} else if (sbed.equals("s")) {
					occupancy += 1;
				} else
					while (!sbed.equals("d") && !sbed.equals("s")) {
						System.out.println("Please enter a valid answer");
						sbed = in.next();
					}
				/*
				 * These lines of code ask the user what are the sizes of the
				 * beds in each room there is at the hotel, reads the input and
				 * creates the sizes of beds to each bed which has been made in
				 * beds list. This is then stored in the sBedlist. This uses the
				 * addsBed, setsBed method in the Bed class and the
				 * getRoomsList, getBedslist method in the other classes. The
				 * validation here also prevents people from entering a wrong
				 * value.
				 */

				hotelR.setHasVacancy(vacancy2);
			}
			hotelR.setOccupancy(occupancy);
			/*
			 * These lines of code use the set methods for occupancy and
			 * hasVacancy variables in the Hotel class.
			 */
		}
		hotelRP.display(hotelR);
		/*
		 * This line of code plays the display method in the HotelReport class
		 */
	}
}
