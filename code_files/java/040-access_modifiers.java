class Employee{
	private int id;
	private String name;
	// one of the use cases for such things apart from code isolation and access prevention
	// is data entry validation.. for ex let's set a restriction that id should be greater than 100.
	public void setData(int x, String y){
		if(id>100)id=x;
		else System.out.println("Please input a number greater than 100 for Employee's id.");
		name=y;
	}
	public void getData(){
		if(id!=0)System.out.println(id);
		System.out.println(name);
	}
}

class Main{
	public static void main(String[] args){
		Employee proff=new Employee();			
		/*
		proff.id=69;
		proff.name="Arpit";
		*/
		// This gave error becuase the access modifier for those variable is set to private..
		// which can only be altered by a method.. belonging to that class only!
		proff.setData(69, "Arpit");
		proff.getData();
	}
}
