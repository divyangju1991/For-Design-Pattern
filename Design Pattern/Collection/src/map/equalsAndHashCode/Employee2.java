package map.equalsAndHashCode;

public class Employee2 {
	
	@Override
	public boolean equals(Object obj){
		
	   if(obj == null) {
		   return false;
	   }
	   
	   if(this.getClass() != obj.getClass()){
		   return false;
	   }
	   
	   Employee2 emp = (Employee2)obj;
       return ((emp.empId == this.empId || emp.empId.equals(this.empId)) 
    		              && (emp.empName == this.empName || emp.empName.equals(this.empName))); 
	   
	}
	
	@Override
	public int hashCode(){
		int hash = (this.empId == null ? 0 : this.empId.hashCode()) + 
				        (this.empName == null ? 0 : this.empName.hashCode());
		return hash;
	}

	/*
	 @Override
	 public boolean equals(Object obj){
	        
	        if(obj==null) 
	               return false;
	        
	        if(this.getClass()!=obj.getClass()) 
	               return false;
	 
	        Employee2 emp=(Employee2)obj;
	        return (emp.empId==this.empId || emp.empId.equals(this.empId))
	                            && (emp.empName==this.empName || emp.empName.equals(this.empName));        
	 }
	        
	 @Override
	 public int hashCode(){
	        int hash=(this.empId==null ? 0: this.empId.hashCode() ) +
	                     (this.empName==null ? 0: this.empName.hashCode() );
	        return hash;      
	}
	*/
	
	
	private Integer empId;
	private String empName;
	private String empAdd;
	
	public int getEmpId() {
		return empId;
	}
	public Employee2 setEmpId(int empId) {
		this.empId = empId;
		return this;
	}
	public String getEmpName() {
		return empName;
	}
	public Employee2 setEmpName(String empName) {
		this.empName = empName;
		return this;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	
	public Employee2 setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	    return this;	
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}
	
}
