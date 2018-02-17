package bean;

public class Mother extends Person{
	
	private String maidenName;
	
	public Mother() {
		super();
		
	}
	
	public Mother(String name, String surname, int age, String maidenName) {
		super(name, surname, age);
		this.maidenName = maidenName;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	@Override
	public String toString() {
		return "Mother [maidenName=" + maidenName + ",\n Age: " + getAge() + ",\n Name: " + getName() + ",\n Surname: " + getSurname() + "]";
	}
	
	
	
}
