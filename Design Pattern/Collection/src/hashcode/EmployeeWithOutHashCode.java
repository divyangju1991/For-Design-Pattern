package hashcode;

public class EmployeeWithOutHashCode {

private Integer id;
	
	private String name;
	
	public EmployeeWithOutHashCode(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		else if(this.getClass() != obj.getClass()){
			return false;
		} else {
			EmployeeWithOutHashCode emp = (EmployeeWithOutHashCode) obj;
			boolean isIdMatch = (this.id == emp.getId() || this.id.equals(emp.getId()));
			boolean isNameMatch = (this.name == emp.getName() || this.name.equals(emp.getName()));
			return isIdMatch && isNameMatch;
		}
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
