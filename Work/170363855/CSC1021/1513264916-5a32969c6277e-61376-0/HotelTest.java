package Project2;

public class HotelTest {
    /*
     * This class is used to test the system which was created in the Hotel, room and Bed classes.
     * Here I have put i the values which the user would put in to check if everything works.
     */
	public static void main(String[] args) {

		Hotel hotel = new Hotel(null);
		HotelReport hotelR = new HotelReport();
		/*
		 * These are creating a instance of the different classes which need to
		 * be accessed in this following code. 
		 */
		hotel.setName("Test Hotel");
		/*
		 * This uses the setName method in the Hotel class and sets the name to Test Hotel.
		 */
		hotel.addRooms(0);
		hotel.addRooms(1);
		hotel.addRooms(2);
	    /*
	     * These lines of code use the addRooms method in the Hotel class and create a room object
	     * in the room list. In this case it creates 3 rooms. However because Java's index starts
	     * 0 I create a room 0, a room 1 and a room 2. This will not be shown and room 0 will always
	     * referred to as room 1, room 1 will be room 2 and room 2 will be room 3
	     */

		hotel.getRoomsList().get(1).addBed(1);
		hotel.getRoomsList().get(1).addBed(1);
		hotel.getRoomsList().get(1).addBed(1);
		hotel.getRoomsList().get(1).addBed(1);
		hotel.getRoomsList().get(0).addBed(1);
		hotel.getRoomsList().get(0).addBed(1);
		hotel.getRoomsList().get(2).addBed(1);
        /*
         * These lines of code use the rooms which have just been created and going through
         * the rooms list access the bed list and create beds which are tied a certain
         * room. Here I create 4 beds for room 1, 2 beds for room 2 and 1 bed for room 3. 
         * This uses the addBed method in the Room class.
         */
		
		hotel.getRoomsList().get(1).getBedsList().get(0).setsBed("d");
		hotel.getRoomsList().get(1).getBedsList().get(1).setsBed("s");
		hotel.getRoomsList().get(1).getBedsList().get(2).setsBed("s");
		hotel.getRoomsList().get(1).getBedsList().get(3).setsBed("s");
		hotel.getRoomsList().get(0).getBedsList().get(0).setsBed("d");
		hotel.getRoomsList().get(0).getBedsList().get(1).setsBed("s");
		hotel.getRoomsList().get(2).getBedsList().get(0).setsBed("s");
		/*
		 * These lines of code use the beds which have just been created and going through
		 * all of the lists to get to the sBed variable and sets a d or s (meaning double 
		 * or single) to a specific bed. This uses the setsBed method in the Bed class.
		 */
		
		hotel.getRoomsList().get(1).getBedsList().get(1).addsBed("d");
		hotel.getRoomsList().get(1).getBedsList().get(1).addsBed("s");
		hotel.getRoomsList().get(1).getBedsList().get(1).addsBed("s");
		hotel.getRoomsList().get(1).getBedsList().get(1).addsBed("s");
		hotel.getRoomsList().get(0).getBedsList().get(0).addsBed("d");
		hotel.getRoomsList().get(0).getBedsList().get(0).addsBed("s");
		hotel.getRoomsList().get(2).getBedsList().get(0).addsBed("s");
		/*
		 * These lines of code make a size of bed in the sBed list going through
		 * all of the lists and sets a d or s to a object in the list. 
		 * This uses the addsBed method in the Bed class.
		 */
		
		hotel.setOccupancy(9);
		hotel.setHasVacancy(1);
		/*
		 * These lines of code use the set methods for occupancy and hasVacancy variables in the Hotel class.
		 */
		hotelR.display(hotel);
		/*
		 * This line of code plays the display method in the HotelReport class
		 */
	}

}