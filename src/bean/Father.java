package bean;

public class Father extends Person{	
	
	private int salary;
	
	public Father() {
		super();
	}
	
	public Father(String name, String surname, int age, int salary) {
		super(name, surname, age);
		this.salary = salary;
	}

	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Father [salary=" + salary + ",\n Age: " + getAge() + ",\n Name: " + getName() + ",\n Surname: " + getSurname() + "]";
	}
	
	
	
}
