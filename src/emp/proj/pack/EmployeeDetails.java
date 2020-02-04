package emp.proj.pack;

public class EmployeeDetails {
	public void empid() {
	System.out.println("Employee id");
	}
	public void empname() {
		System.out .println("Emp Name");
	}
	
	public void empdob() {
		System.out .println("Emp DOB");
	}
	public void empphone() {
		System.out .println("Phone No");
	}
	public void empemailid() {
		System.out .println("Email ID");
	}
	
	
	public static void main(String[] args) {
	EmployeeDetails em = new EmployeeDetails();
	em.empid();
	em.empname();
	em.empdob();
	em.empphone();
	em.empemailid();
	
	}
}
