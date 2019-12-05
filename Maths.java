import java.util.Scanner;
abstract class Shape     //abstract class with functions which can be override as per the class
{
	abstract double area();       //area function declared as abstarct to achieve polymorphism
	abstract double perimeter();  //perimeter function declared as abstract to achieve polymorphism
}
class Rectangle extends Shape   //Rectangle class inherits from Shape class
{
	double l;
	double b;
	double area()      //polymorphism(overriding method)
	{
		return l*b;
	}
	double perimeter()   //polymorphism(overriding method)
	{
		return 2*(l+b);
	}
	Rectangle(double len,double bre)
	{
		this.l = len;
		this.b = bre;
	}
}
class Square extends Shape   //Square class inherits from Shape class
{
	double side;
	double area()     // //polymorphism(overriding method)
	{
		return side*side;
	}
	double perimeter()      //polymorphism(overriding method)
	{
		return 4*side;
	}
	Square(double s)
	{
		this.side = s;
	}
}
class Circle extends Shape   //Circle class inherits from Shape class
{
	double radius;
	double area()        //polymorphism(overriding method)
	{
		return 3.14*radius*radius;
	}
	double perimeter()           //polymorphism(overriding method)
	{
		return 2*3.14*radius;
	}
	Circle(double r)
	{
		this.radius = r;
	}
}
class Maths
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the shape name: s for square, c for circle and r for rectangle");
		char c = scan.nextLine().charAt(0);
		switch(c)
		{
			case 's':
					System.out.println("enter the length of the side");
					double s = scan.nextDouble();
					Square sq = new Square(s);
					System.out.println("area is: "+ sq.area() + " and perimeter is: "+ sq.perimeter());
					break;
			case 'r':
					System.out.println("enter the length and breadth of the rectangle");
					double l = scan.nextDouble();
					double b = scan.nextDouble();
					Rectangle rec = new Rectangle(l,b);
					System.out.println("area is: "+ rec.area() + " and perimeter is: "+ rec.perimeter());
					break;
			case 'c':
					System.out.println("enter the radius of the circle");
					double r = scan.nextDouble();
					Circle cir = new Circle(c);
					System.out.println("area is: "+ cir.area() + " and perimeter is: "+ cir.perimeter());
					break;
		}
	}
}
