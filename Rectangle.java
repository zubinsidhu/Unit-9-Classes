//Lab9.1
public class Rectangle {

	double width = 1.0;
	double height = 1.0;
	
	public Rectangle() {}
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	public void setHeight(double newHeight) {
		height = newHeight;
	}
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2 * (width + height);
	}
	public String toString() {
		return "Rectangle with width " + width + " and height " + height + ": ";
	}
}
