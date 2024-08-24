//Lab9.1
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2, 3);
		
		System.out.println(r1);
		System.out.println("r1 area: " + r1.getArea() + ", r1 perimeter: " + r1.getPerimeter());
		System.out.println(r2);
		System.out.println("r2 area: " + r2.getArea() + ", r2 perimeter: " + r2.getPerimeter());
	}
}
