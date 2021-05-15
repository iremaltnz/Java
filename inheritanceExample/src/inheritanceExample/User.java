package inheritanceExample;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private String email;
	private String department;
	
	public User() {
		
	}
	public User(int id, String firstName, String lastName,String identityNumber,String email,String department) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber=identityNumber;
		this.email=email;
		this.department=department;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public String getIdentityNumber() {
		return identityNumber;
	}
	
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
