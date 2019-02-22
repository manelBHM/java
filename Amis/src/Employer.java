
public class Employer extends Person {
	private static final int SMIC = 1200;
	private double salary;

	public Employer() {
		super();
		this.setSalary(SMIC);
	}

	public Employer(String nom, String prenm, String email, double salary) {
		super(nom, prenm, email);
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary <= 0) {
			throw new RuntimeException("Salary must be greater then 0 €");
		}
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", Salary :" + this.salary + "€";
	}
}
