class Student{
	private String name;
	private int regNo;
	private String course;
	
	//constructor
	Student(String name,int regNo,String course){
		this.name=name;
		this.regNo=regNo;
		this.course=course;
	}

	public String getName(){
		return name;
	}	
	public void setName(String name){	
		this.name=name;	
	}
	
	public int getregNo(){
		return regNo;
	}	
	public void setregNo(int regNo){	
		this.regNo=regNo;	
	}
	
	public String getcourse(){
		return course;
	}	
	public void setcourse(String course){	
		this.course=course;	
	}

	public void display(){
		System.out.println("Name: "+name+" , regNo: "+regNo+" , course: "+course);
	}
	
}