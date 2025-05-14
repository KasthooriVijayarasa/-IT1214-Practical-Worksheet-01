import java.util.Scanner;

class Person{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter age: ");
		age=sc.nextInt();
		System.out.println("Name: "+name+" Age: "+age);
	}
}