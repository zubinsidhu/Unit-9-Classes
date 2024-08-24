import java.util.Scanner;

public class OperationRational {

	public static void main(String[] args) {
		final char c = 'c';
		final char add = '+';
		final char sub = '-';
		final char mult = '*';
		final char div = '/';
		final char q = 'q';
		Rational r = new Rational();
		Rational t = new Rational();
		System.out.println("Current Global Value: " + r);
		char choice;
		int n;
		int d;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("-----------------------------------------------" + "\n\t\tMain Menu\n" 
			+ "-----------------------------------------------");
			System.out.println("c: Change the current value\n+: Add a Rational to the current value"
					+ "\n-: Subtract a Rational from the current value"
					+ "\n*: Multiply a Rational to the current value"
					+ "\n/: Divide a Rational to the current value\nq: Quit");
			System.out.print("Enter a command: ");
			choice = input.next().charAt(0);
			switch(choice) {
			case c: 
				System.out.println("Enter 2 integers for numerator & denominator: ");
				n = input.nextInt();
				d = input.nextInt();
				if (d == 0) {
					System.out.println("Denominator can't be 0");
					System.exit(0);
				}
				r.setNumerator(n);
				r.setDenominator(d);
				System.out.println("New Global Value: " + r);
				break;
			case add:
				System.out.println("Enter 2 integers for numerator & denominator of Rational to Add: ");
				n = input.nextInt();
				d = input.nextInt();
				if (d == 0) {
					System.out.println("Denominator can't be 0");
					System.exit(0);
				}
				t.setNumerator(n);
				t.setDenominator(d);
				if (d == 0) {
					System.out.println("Denominator can't be 0");
					System.exit(0);
				}
				System.out.println(r + " + " + t + " = " + Rational.add(r, t));
				r = Rational.add(r, t);
				System.out.println("Current Value Updated: " + r);
				break;
			case sub:
				System.out.println("Enter 2 integers for numerator & denominator of Rational to Subtract: ");
				n = input.nextInt();
				d = input.nextInt();
				if (d == 0) {
					System.out.println("Denominator can't be 0");
					System.exit(0);
				}
				t.setNumerator(n);
				t.setDenominator(d);
				System.out.println(r + " - " + t + " = " + Rational.subtract(r, t));
				r = Rational.subtract(r, t);
				System.out.println("Current Value Updated: " + r);
				break;
			case mult:
				System.out.println("Enter 2 integers for numerator & denominator of Rational to Multiply: ");
				n = input.nextInt();
				d = input.nextInt();
				if (d == 0) {
					System.out.println("Denominator can't be 0");
					System.exit(0);
				}
				t.setNumerator(n);
				t.setDenominator(d);
				System.out.println(r + " * " + t + " = " + Rational.multiply(r, t));
				r = Rational.multiply(r, t);
				System.out.println("Current Value Updated: " + r);
				break;
			case div:
				System.out.println("Enter 2 integers for numerator & denominator of Rational to Divide: ");
				n = input.nextInt();
				d = input.nextInt();
				if (d == 0) {
					System.out.println("Denominator can't be 0");
					System.exit(0);
				}
				t.setNumerator(n);
				t.setDenominator(d);
				System.out.println(r + " / " + t + " = " + Rational.division(r, t));
				r = Rational.division(r, t);
				System.out.println("Current Value Updated: " + r);
				break;
			case q:
				System.out.println("End of Program");
				break;
			}
		}while (choice != 'q');
		input.close();
	}

}
