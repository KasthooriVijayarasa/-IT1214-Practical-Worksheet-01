class Test{	
	public static void main(String[] ar){
		
		Student student=new Student("Kasthoori",130,"IT");
		student.display();
		
		
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle(5,10);
		System.out.println("Area of rect2: "+rect2.area());
		
		Calculator calc=new Calculator();
		System.out.println("Add two integers: "+calc.add(2,3));
		System.out.println("Add three integers: "+calc.add(2,3,4));
		System.out.println("Add two doubles: "+calc.add(2.5,3.5));
		
		Car car=new Car();
		car.brand="Tokyo";
		car.speed=120;
		car.model="Corolla";
		car.display();
		
		BankAccount account=new BankAccount("kas");
		account.deposit(5000);
		account.withdraw(1500);
		account.displayBalance();
		
		Book book1=new Book("Java Basics", "Author A", 300.0);
		Book book2 = new Book("Python Essentials", "Author B");
		
		Circle circle=new Circle();
		circle.radius=5.0;
		circle.area(); 
		
		Person person=new Person();
		person.input();
		person.setName("Alice");
		person.setAge(25);
		System.out.println("Person name: "+person.getName());
		System.out.println("Person Age: "+person.getAge());
		
		TemperatureConverter conveter=new TemperatureConverter();
		System.out.println("30  Celsius to Fahrenheit: "+conveter.toFahrenheit(30));
		System.out.println("86  Fahrenheit to Celsius: "+conveter.toCelsius(86));
		
		Manager manager=new Manager("Bob",201,75000);
		manager.displayDetails();
		
		
	}
}