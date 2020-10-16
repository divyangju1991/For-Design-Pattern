package map.equalsAndHashCode;

public class Employee {

	private int empId;
	private String empName;
	private String empAdd;
	
	public int getEmpId() {
		return empId;
	}
	public Employee setEmpId(int empId) {
		this.empId = empId;
		return this;
	}
	public String getEmpName() {
		return empName;
	}
	public Employee setEmpName(String empName) {
		this.empName = empName;
		return this;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	
	public Employee setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	    return this;	
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}
	
}
