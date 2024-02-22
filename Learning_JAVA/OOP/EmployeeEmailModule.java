public class EmployeeEmailModule {
	//Only to test classes
	
	public static void main(String[] args) {
		Employee employee = new Employee(null, null, null);
	}
}
	
class Email {

	private String home; //Records home email
	private String work; //Records work email
	
	public Email(String home, String work) {
		this.home = home;
		this.work = work;
	}
	
	public String getHome() { //Getter
		return this.home;
	}
	
	public String getWork() {
		return this.work;
	}
	
	public void setHome(String home) { //Setter
		this.home = home;
	}
	
	public void setWork(String work) {
		this.work = work;
	}
}

class Employee {
	private String surname;
	private String firstName;
	private Email emailAddress;
	
	public Employee(String surname, String firstName, Email emailAddress) {
		this.surname = surname;
		this.firstName = firstName;
	}
	
	public String fullName() {
		return firstName + " " +  surname;
	}
	
	public Email getEmails() {
		return emailAddress;
	}
	
	public String workEmail() {
		return emailAddress.getWork();
	}
	
	public String homeEmail() {
		return emailAddress.getHome();
	}
}


