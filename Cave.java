package tunnels;

/**
 * @author NPokhrel
 */

public class Cave {

	String cName;
	String cLongitude;
	String cLatitude;

	public Cave(String name, String longitude, String latitude) {
		cName = name;
		cLongitude = longitude;
		cLatitude = latitude;
	}

	public String getName() {
		return cName;
	}

	public String getLongitude() {
		return cLongitude;
	}

	public String getLatitude() {
		return cLatitude;
	}

	public String getGPS() {
		return (cLatitude+ cLongitude);
	}

}
