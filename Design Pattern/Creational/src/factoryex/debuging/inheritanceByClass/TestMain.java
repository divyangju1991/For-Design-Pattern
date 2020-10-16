package factoryex.debuging.inheritanceByClass;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperClass superObj = new ChildClass();
		superObj.setName("Divyang");
		
		System.out.println(superObj.getName());
		
		//superObj.setOtherObject();
		//method is undefined
		

	}

}
