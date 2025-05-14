class Book{
	private String title;
	private String author;
	private double price;
	
	Book(String title,String author,double price){		
		this.title = title;
        this.author = author;
        this.price = price;
		System.out.println("Title: "+title+" ,Author: "+author+" ,Price: "+price);
	}
	
	Book(String title,String author){	
		this.title = title;
        this.author = author;
        this.price = 0.0;
		System.out.println("Title: "+title+" ,Author: "+author);
	}
	
}