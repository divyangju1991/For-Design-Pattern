package hashcode;

public class Employee {
	
	private Integer id;
	
	private String name;
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int result = ((this.id == null) ? 0: this.id.hashCode()) + ((this.name == null) ? 0: this.name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		else if(this.getClass() != obj.getClass()){
			return false;
		} else {
			Employee emp = (Employee) obj;
			boolean isIdMatch = (this.id == emp.getId() || this.id.equals(emp.getId()));
			boolean isNameMatch = (this.name == emp.getName() || this.name.equals(emp.getName()));
			return isIdMatch && isNameMatch;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
