package groupingBy;

public class Employee {

	private String city;
	
	private String name;
	
	public Employee(String city, String name) {
		super();
		this.city = city;
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [city=" + city + ", name=" + name + "]";
	}
	
	
}
