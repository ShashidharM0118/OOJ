import java.util.Scanner;

class Books{
	String name;
	String author;
	int price;
	int numPages;
	
	public Books(String name,String author,int price,int numPages){
		this.name = name;
		this.author = author;
		this.price = price;
		this.numPages = numPages;
	}
	public String toString(){
		String name, author, price, numPages;
		
		name = "Book name: " + this.name + "\n";
		author = "Author name: " + this.author + "\n";
		price = "Price: " + this.price + "\n";
		numPages = "Number of pages: " + this.numPages + "\n";
		
		return name + author + price + numPages;
	}
	void setName(String name){
		this.name = name;
	}
	void setAuthor(String author){
		this.author = author;
	}
	void setPrice(int price){
		this.price = price;
	}
	void setNumPages(int numPages){
		this.numPages = numPages;
	}
	String getName(){
		return name;
	}
	String getAuthor(){
		return author;
	}
	int getPrice(){
		return price;
	}
	int getPgNum(){
		return numPages;
	}
}
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, price, numPages;
		String name, author;
		System.out.println("Enter the number of books");
		n = sc.nextInt();
		sc.nextLine();
		Books b[]= new Books[n];
		for(int i =0;i<n;i++){
			System.out.println("Read name of the book");
			name = sc.nextLine();
			System.out.println("Read author of the book");
			author = sc.nextLine();
			System.out.println("Read the price of the book");
			price = sc.nextInt();
			System.out.println("Read pgNumbers of the book");
			numPages = sc.nextInt();
			sc.nextLine();
			System.out.println("----------------------------------------");
			b[i] = new Books(name,author,price,numPages);
		}
		for(int i =0;i<n;i++){
			String bookDetails = b[i].toString();
			System.out.println(bookDetails);
		}
		for(int i =0;i<n;i++){
			System.out.println("Book name is "+b[i].getName());
			System.out.println("Book author is "+b[i].getAuthor());
			System.out.println("Book price is "+b[i].getPrice());
			System.out.println("Book has number of pages = "+b[i].getPgNum()+"\n");			
		}
		System.out.println("Name : Shashdihar B M");
		System.out.println("USN : 1BM22CS257");
		
	}
}