// CONSTRUCTOR
/*
	These are member functions of that class used to initialise it's attributes while instantiation.
*/
class Employee{
	private int id;
	private String name;
	public void setData(int x, String y){
		id=x;
		name=y;
	}
	public void getData(){
		System.out.println("ID: "+id+"   Name: "+name);
	}
	// Constructor has the same name as that of class.
	// It is invoked automatically
	// It has no return type
	public Employee(){
		id=96;
		name="proffapt";
	}
	// This is another constructor.. but changing the arguments this time
	// This is POC for constructor overloading
	public Employee(int x, String y){
		id=x;
		name=y;
	}
}

class Main{
	public static void main(String[] args){
		Employee proff=new Employee();			
		proff.getData();
		proff.setData(69, "Arpit");
		proff.getData();
		Employee jan=new Employee(33, "her");
		jan.getData();
	}
}
