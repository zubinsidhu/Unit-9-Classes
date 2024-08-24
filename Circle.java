
public class Circle {
	
	double radius = 1;
	public static int numberOfObjects;
	
	public Circle() { numberOfObjects++; }
	public Circle(double r) {
		radius = r;
		numberOfObjects++;
	}
	
	public double getRadius() { return radius; }
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public String toString() {
		return "Circle with Radius: " + radius;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("c1 radius: " + c1.radius);
		Circle c2 = new Circle();
		System.out.println("c1 radius: " + c2.radius);
		System.out.println("Number of Circles: " + Circle.getNumberOfObjects());
	}
	
}