class Circle extends Shape{
	double radius;
	
	@Override
	void area(){
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle: "+area);
	}
} 