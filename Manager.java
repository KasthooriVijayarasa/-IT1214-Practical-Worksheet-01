class Manager extends Employee{
	Manager(String name,int id,double salary){
		super(name,id,salary);
	}
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("Bonus: "+(0.1*salary));
	}
}