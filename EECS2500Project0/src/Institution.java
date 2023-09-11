/**
 * 
 */

/**
 * @author jerry
 *
 * This is a class representing a single institution.  It consists of constructors, 
 * getters, and setters.  A main program is present to provide help in testing this
 * program.  
 * 
 */
public class Institution {
	protected String officialName;
	protected String nickname;
	protected String city;
	protected String state;
	protected int    yearFounded;
	protected int    numberOfStudents;

	
	/**
	 * @return the officialName
	 */
	public String getOfficialName() {
		return officialName;
	}


	/**
	 * @param officialName the officialName to set
	 */
	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}


	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}


	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @return the yearFounded
	 */
	public int getYearFounded() {
		return yearFounded;
	}


	/**
	 * @param yearFounded the yearFounded to set
	 */
	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}


	/**
	 * @return the numberOfStudents
	 */
	public int getNumberOfStudents() {
		return numberOfStudents;
	}


	/**
	 * @param numberOfStudents the numberOfStudents to set
	 */
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}



	/**
	 * @param officialName
	 * @param nickname
	 * @param city
	 * @param state
	 * @param yearFounded
	 * @param numberOfStudents
	 */
	public Institution(String officialName, String nickname, String city, String state, int yearFounded,
			int numberOfStudents) {
		this.officialName = officialName;
		this.nickname = nickname;
		this.city = city;
		this.state = state;
		this.yearFounded = yearFounded;
		this.numberOfStudents = numberOfStudents;
	}

	

	@Override
	public String toString() {
		return "Institution [officialName=" + officialName + ", nickname=" + nickname + ", city=" + city + ", state="
				+ state + ", yearFounded=" + yearFounded + ", numberOfStudents=" + numberOfStudents + "]";
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institution toledo;
		toledo = new Institution("University of Toledo", "Toledo Rockets", "Toledo", "Ohio", 1872, 15000);
		System.out.println(toledo.getOfficialName() + " (" + toledo.getNickname() + ")")
;
		System.out.println(toledo.getCity() + ", " + toledo.getState());
		System.out.println("Established: "+ toledo.getYearFounded());
		System.out.println("Students : " + toledo.getNumberOfStudents());
		
		toledo.setNickname("Rocky Road");
		toledo.setNumberOfStudents(15001);
		toledo.setState("Illinois");
		toledo.setCity("Urbana");
		toledo.setYearFounded(1877);
		
		System.out.println(toledo);
		System.exit(0);
	}
}
