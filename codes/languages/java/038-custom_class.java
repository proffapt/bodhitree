// public class Employee{
// Only one public class is allowed in a java file -> and it's name must be 
// equal to the file name
// when not mentioned the access modifier is set to default
class Employee{
	// id used here is non-static attribute
	int id;
	String name;
	public void getData(){ // thus the function shall also be non-static
		System.out.println(id);
		System.out.println(name);
	}
	public void setData(int x, String y){
		id=x;
		name=y;
	}
}

class Main{
	public static void main(String[] args){
		Employee proffapt = new Employee(); // Instantiating a new object named proffapt of class Employee.
		Employee jan = new Employee(); // Instantiating a new object named proffapt of class Employee.
		// configuring data
		proffapt.setData(9, "arpit");
		jan.setData(6, "her");
		// printing data
		proffapt.getData();
		jan.getData();
		// manually modifying attributes
		jan.id=9;
		jan.name="she";
		jan.getData();
	}
}
