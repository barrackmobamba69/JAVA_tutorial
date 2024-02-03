
public class Email {

	private String home; //Records home email
	private String work; //Records work email
	
	public Email(String home, String work) {
		this.home = home;
		this.work = work;
	}
	
	public String getHome() {
		return this.home;
	}
	
	public String getWork() {
		return this.work;
	}
	
	public String setHome() {
		return home+= home;
	}
	
	public String setWork() {
		return work+= work;
	}
}
