
public class User {
	int userid;
	String firstName;
	String lastName;
	int yearofBirth;
	String nationalIdentity;
	
	public User() {
		
	}
	public User(int userid, String firstName, String lastName, int yearofBirth, String nationalIdentity) {
		super();
		this.userid = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearofBirth = yearofBirth;
		this.nationalIdentity = nationalIdentity;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearofBirth() {
		return yearofBirth;
	}
	public void setYearofBirth(int yearofBirth) {
		this.yearofBirth = yearofBirth;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	
}
