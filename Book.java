package BookAuthor;

public class Book extends Author{
	
	String name;
	double price;
	int qty = 1;
	String aname;
	
	public Book (String name, Author author, double price) {
		super(author.name, author.email, author.gender);
		this.name = name;
		this.aname = author.name;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		super(author.name, author.email, author.gender);
		this.name = name;
		this.aname = author.name;
		this.qty = qty;
		this.price = qty * price;
		
	}
	
	public void display() {
		System.out.println("Book Name : "+name);
		System.out.println("Author : "+ super.name);
		System.out.println("Qty : "+qty);
		System.out.println("Price : "+price);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("James Gosling", "jamesg12@gmail.com",'m');
		Author a2 = new Author("Bulent Ozkir", "bulento23@gmail.com",'m');
		Author a3 = new Author("Khin Hnin Kyi Thar", "khinhnin@gmail.com",'f');
		
		Book b1 = new Book("Java Programming Language", a1, 10000);
		Book b2 = new Book("C# Programming Language", a2, 10000);
		Book b3 = new Book("Khaing", a3, 5000,4);
		
		b1.display();
		b2.display();
		b3.display();
	}

}
