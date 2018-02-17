package bean;

public class Child extends Person {	
	private Child[] chi = new Child[3];
	private Gender gender;
	public Child() {
		super();
	}
	
	public Child(String name, String surname, int age, String gender) {
		super(name, surname, age, gender);
		
	}
	
	
	
	public Child[] getChi() {
		return chi;
	}

	public void setChi(Child[] chi) {
		this.chi = chi;
	}

	@Override
	public String toString() {
		return "Child [gender=" + gender + ",\n Age: " + getAge() + ",\n Name: " + getName() + ",\n Surname: " + getSurname() + "]";
	}
}




	
