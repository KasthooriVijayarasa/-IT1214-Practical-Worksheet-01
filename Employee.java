class Employee{
	String name;
	int id;
	double salary;
	
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	void  displayDetails(){
		System.out.println("Name: "+name+" ,id: "+id+" ,salary: "+salary);
	}
}