
class Figure{
	double a;
	double b;
	Figure(double x,double y){
		a = x;
		b = y;
	}
	void area(){
		System.out.println("Area for Fiigure is undefined. ");
		System.out.println("Area is "+0);
	}
}

class Rectangle extends Figure{
	Rectangle(double x,double y){
		super(x,y);
	}
	void area(){
		System.out.println("Inside Area for Rectangle. ");
		System.out.println("Area is "+ (a*b));
	}
}

class Triangle extends Figure{
	Triangle(double x,double y){
		super(x,y);
	}
	void area(){
		System.out.println("Inside Area for Triangle. ");
		System.out.println("Area is "+ (a*b*5));
	}
}


public class Additional{
	public static void main(String args[]){
		Rectangle r = new Rectangle(10,5);
		Triangle t = new Triangle(10, 8);
		Figure f = new Figure(1,10);
		f.area();
		Figure figref;
		figref = r;

		figref.area();
		figref = t;

		figref.area();
	}
}