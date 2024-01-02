import java.util.Scanner;

class InputScanner{
	Scanner s;
	InputScanner(){
		s = new Scanner(System.in);
	}
}
abstract class Shape extends InputScanner{
	double a;
	double b;

	abstract void getInput();
	abstract void displayArea();
}

class Rectangle extends Shape{
	
	void getInput(){
		InputScanner is = new InputScanner();
		System.out.println("Enter the length and breadth of the rectangle :");
		a = is.s.nextDouble();
		b = is.s.nextDouble();
	}
	void displayArea(){
		System.out.println("The area of the rectangle is :"+(a*b));
	}
	

}
class Triangle extends Shape{
	
	void getInput(){
		InputScanner is = new InputScanner();
		System.out.println("Enter the base and height of the triangle :");
		a = is.s.nextDouble();
		b = is.s.nextDouble();
	}
	void displayArea(){
		System.out.println("The area of the triangle is :"+(a*b*0.5));
	}
	

}
class Circle extends Shape{
	
	void getInput(){
		InputScanner is = new InputScanner();
		System.out.println("Enter radius of the Cirlce :");
		a = is.s.nextDouble();
	}
	void displayArea(){
		System.out.println("The area of the Circle is :"+(3.14*a*a));
	}
	

}
public class AbstractMain{
	public static void main(String args[]){
		System.out.println("HI");
		Rectangle rect = new Rectangle();
		rect.getInput();
		rect.displayArea();

		Triangle triangle = new Triangle();
		triangle.getInput();
		triangle.displayArea();

		Circle circle = new Circle();
		circle.getInput();
		circle.displayArea();
	}
}