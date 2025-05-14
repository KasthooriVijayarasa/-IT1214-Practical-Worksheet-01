class Car extends Vehicle{
	String model;
	
	@Override
	void display(){
		System.out.println("Brand: "+brand+" ,Speed: "+speed+" km/h "+" ,model: "+model);
	}
} 