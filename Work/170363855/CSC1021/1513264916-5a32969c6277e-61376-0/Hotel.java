package Project2;

import java.util.ArrayList;
import java.util.List;
// These imports allow me to be able to use the list and array list features in my code which are used to store the key information about the hotel 

public class Hotel {
	/*
	 * This class holds the information for the hotels name and number of rooms
	 * using the corresponding getters and setters. Furthermore, the Hotel class
	 * is the first port of call in the code as the information stored in the
	 * Room and Bed class are all accessed through the hotel class using the
	 * list which is created in this class.
	 */
	List<Room> roomsL = new ArrayList<>();
	/*
	 * This is the first List which is made and is firstly used to create and
	 * store and number of rooms which is given in either the HotelTest class or
	 * the HotelConfigure class. Then this list is also used to access the other
	 * lists created in the Room and Bed class respectively. The following
	 * getters and setters are found below.
	 */
	private String name;
	/*
	 * This is the variable which is used to store the information regarding the
	 * hotels name. The following getters and setters are found below.
	 */
	private int occupancy;
	private int hasVacancy;

	/*
	 * These are the variables which are used to to hold the information about
	 * the about the number of people which can stay at the hotel. The occupancy
	 * variable holds the number of people that would be able to stay at the
	 * hotel if ever room was vacant. The hasVacancy variable holds the number
	 * of rooms which are vacant at the hotel. The following getters and setters
	 * are found below.
	 */
	public Hotel(String name) {

	}

	/*
	 * This is a constructor for the Hotel object. This method allows me to
	 * store the hotels name further on in the code.
	 */
	public List<Room> getRoomsList() {
		return roomsL;
	}

	/*
	 * This is the get method for the rooms list, it allows me to be able to
	 * pull the information on the amount of rooms at the hotel. This method is
	 * also called to get to the other lists in the Room and Bed classes. It is
	 * called and used in the HotelTest, HotelConfigure and HotelReport classes.
	 */
	public void setRoomsList(List<Room> roomsList) {
		this.roomsL = roomsList;
	}
	/*
	 * This is the set method for the rooms list, it allows me to be able to set
	 * the information on the amount of rooms at the hotel when given in the
	 * HotelConfigure or HotelTest classes. It is used in the HotelTest,
	 * HotelConfigure and HotelReport classes.
	 */

	public String getName() {
		return name;
	}

	/*
	 * This is the get method for the name variable, it allows me to be able to
	 * pull the information about the hotels name when given in the
	 * HotelConfigure or HotelTest classes. It is called and used in the
	 * HotelReport class.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * This is the set method for the name variable, this allows me to set the
	 * hotels name when given in the HotelConfigure or HotelTest classes. It is
	 * used in the HotelTest and HotelConfigure classes.
	 */
	public void addRooms(int a) {
		roomsL.add(new Room(a));
	}

	/*
	 * This addRooms method allows me to create a room in the room list which is
	 * shown above. It is placed there and is then used in the room list later
	 * in the code.It is used in the HotelTest and HotelConfigure classes.
	 */
	public int getOccupancy() {
		return occupancy;
	}

	/*
	 * This is the get method for the occupancy variable, it allows me to be
	 * able to pull the information about the amount of people that could fit in
	 * the hotel when given in the HotelConfigure or HotelTest classes. It is
	 * called and used in the HotelReport class.
	 */

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}

	/*
	 * This is the set method for the occupancy variable, this allows me to set
	 * the amount of people that could fit into the hotel when given in the
	 * HotelConfigure or HotelTest classes. It is used in the HotelTest and
	 * HotelConfigure classes.
	 */
	public int getHasVacancy() {
		return hasVacancy;
	}

	/*
	 * This is the get method for the hasVacancy variable, it allows me to be
	 * able to pull the information about the amount of rooms which are not
	 * being used in the hotel when given in the HotelConfigure or HotelTest
	 * classes. It is called and used in the HotelReport class.
	 */

	public void setHasVacancy(int hasVacancy) {
		this.hasVacancy = hasVacancy;
	}
	/*
	 * This is the set method for the hasVacancy variable, this allows me to set
	 * the amount rooms which are not being used in into the hotel when given in
	 * the HotelConfigure or HotelTest classes. It is used in the HotelTest and
	 * HotelConfigure classes.
	 */
}
