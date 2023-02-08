package models;

public class EmployeeAccount {
	int employeeID;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String hub;
	
	public EmployeeAccount(int employeeID, String firstName, String lastName, String userName, String password,
			String hub) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.hub = hub;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHubID() {
		return hub;
	}

	public void setHubID(String hub) {
		this.hub = hub;
	}
	
	
}
