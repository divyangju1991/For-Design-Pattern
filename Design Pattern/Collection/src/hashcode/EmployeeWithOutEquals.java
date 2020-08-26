package hashcode;

public class EmployeeWithOutEquals {
	
	private Integer id;
	
	private String name;
	
	public EmployeeWithOutEquals(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		int result = ((this.id == null) ? 0: this.id.hashCode()) + ((this.name == null) ? 0: this.name.hashCode());
		return result;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
