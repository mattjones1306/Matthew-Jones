package Project2;

import java.util.ArrayList;
import java.util.List;

public class Bed {
	/*
	 * This class holds the information for the size of beds in each room using
	 * the corresponding getters and setters. The Bed class holds the sbedList
	 * which is accessed through the roomsList in the Hotel class and the
	 * bedslist in the Room class.
	 */
	List<String> sBedslist = new ArrayList<String>();
	/*
	 * This is the third and last List which is made and is used to create and
	 * store the size of beds which is given in either the HotelTest class or
	 * the HotelConfigure class. This list is accessed through the roomList in
	 * hotel and bedslist in the Room class. The following getters and setters
	 * are found below.
	 */
	private String sbed;

	/*
	 * This is the variable which is used to store the information regarding the
	 * sizes of the beds. The following getters and setters are found below.
	 */
	public String getsBed() {
		return sbed;
	}

	/*
	 * This is the get method for the sbed variable, it allows me to be able to
	 * pull the information about the size of beds in each room when given in
	 * the HotelConfigure or HotelTest classes. It is called and used in the
	 * HotelReport class.
	 */
	public void setsBed(String sbed) {
		this.sbed = sbed;
	}

	/*
	 * This is the set method for the sbed variable, this allows me to set the
	 * size of beds in each room when given in the HotelConfigure or HotelTest
	 * classes. It is used in the HotelTest and HotelConfigure classes.
	 */
	public void addsBed(String sbed) {
		sBedslist.add(new String());
	}
	/*
	 * This addsBed method allows me to create a size of bed string in the bed
	 * list which corresponds to a certain bed in the bed list and a certain
	 * room in the room list. It is placed there and is then used in the sBed
	 * list later in the code. It is used in the HotelTest and HotelConfigure
	 * classes.
	 */

	public String toString() {

		return getsBed();

	}
	/*
	 * This String toSring method allows me to get the information using the
	 * getsBed method and put that into a visible string instead of the location
	 * of the list. This is used in the HotelReport.
	 */
}
