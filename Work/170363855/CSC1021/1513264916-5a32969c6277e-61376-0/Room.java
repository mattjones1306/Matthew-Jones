package Project2;

import java.util.ArrayList;
import java.util.List;

public class Room {
	/*
	 * This class holds the information for the number of beds in each room
	 * using the corresponding getters and setters. The Room class holds the
	 * bedsList which is accessed through the roomsList in the Hotel class.
	 */

	List<Bed> bedsList = new ArrayList<>();
	/*
	 * This is the second List which is made and is used to create and store and
	 * number of beds which is given in either the HotelTest class or the
	 * HotelConfigure class. This list is accessed through the roomList in hotel
	 * and this list is used to get to the list in the Bed class. The following
	 * getters and setters are found below.
	 */

	public Room(int bed) {

	}
	/*
	 * This is a constructor for the Room object. This method allows me to to
	 * use the addRoom method in the Hotel class.
	 */

	public List<Bed> getBedsList() {
		return bedsList;
	}

	/*
	 * This is the get method for the beds list, it allows me to be able to pull
	 * the information on the amount of beds at the hotel. This method is also
	 * called to get to the list in Bed class. It is called and used in the
	 * HotelTest, HotelConfigure and HotelReport classes.
	 */
	public void setBedsList(List<Bed> bedsList) {
		this.bedsList = bedsList;
	}

	/*
	 * This is the set method for the beds list, it allows me to be able to set
	 * the information on the amount of beds at the hotel when given in the
	 * HotelConfigure or HotelTest classes. It is used in the HotelTest,
	 * HotelConfigure and HotelReport classes.
	 */
	public void addBed(int beds) {
		for (int i = 0; i < beds; i = i + 1) {
			bedsList.add(new Bed());
		}
	}
	/*
	 * This addBed method allows me to create a bed in the bed list which
	 * corresponds to a certain room in the room list. It is placed there and is
	 * then used in the bed list later in the code. It is used in the HotelTest
	 * and HotelConfigure classes. The for loop allows me to create multiple
	 * beds in a single room.
	 */
}