public class TestDate {

	public static void main(String[] args) {
		Date jul1 = new Date(7, 1);
		Date jan1 = new Date(1, 11);
		Date dec1 = new Date(12, 1);
		Date d = new Date(7, 1);
		
		System.out.println(jul1 + " comes before " + jan1 + " " + (jul1.compareTo(jan1) < 0));
		System.out.println(jul1 + " comes before " + dec1 + " " + (jul1.compareTo(dec1) < 0));
		System.out.println(jul1 + " is the same as " + d + " " + (jul1.compareTo(d) == 0));
	}
}
