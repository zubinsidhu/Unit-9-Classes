
public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(10);
		
		System.out.println(c1);
		System.out.println("c1 radius: " + c1.radius);
		System.out.println("c1 area: " + c1.getArea());
		System.out.println("c1 perimeter: " + c1.getPerimeter());
		/*
		System.out.println(c2);
		System.out.println("c2 radius: " + c2.radius);
		System.out.println("c2 area: " + c2.getArea());
		System.out.println("c2 perimeter: " + c2.getPerimeter());
		
		c1 = c2;
		System.out.println(c1);
		System.out.println(c2);
		c2.setRadius(3);
		System.out.println(c1);
		System.out.println(c2);
		
		int n = 5;
		printAreas(c1, n);
		System.out.println("\nRadius: " + c1.getRadius()); System.out.println("n: " + n);
		*/
		System.out.println("c1 radius: " + c1.getRadius());
		System.out.println("c1 radius: " + c2.radius);
		System.out.println("Number of Circles: " + Circle.getNumberOfObjects());
		int n = 5;
		Circle[] c = createCircles(n);
		printCircles(c);
	}
	/*
	public static void printAreas(Circle c, int n) {
		System.out.println("Radius\tArea");
		while (n >= 1) {
			System.out.printf("%.2f\t%.2f\n", c.getRadius(), c.getArea());
			c.setRadius(c.getRadius() + 1);
			n--;
		}
	}
	*/
	public static Circle[] createCircles(int n) {
		Circle[] result = new Circle[n];
		for (int i = 0; i < n; i++) {
			result[i] = new Circle(Math.random() * 100);
		}
		return result;
	}
	
	public static void printCircles(Circle[] a) {
		double sumArea = 0;
		System.out.println("Radius\t\t\tArea");
		for (Circle e: a) {
			sumArea += e.getArea();
			System.out.print(e.getRadius() + "\t" + e.getArea() + "\n");
		}
		
		System.out.println("Sum of Area: " + sumArea);
	}	
}
//42 2 1011