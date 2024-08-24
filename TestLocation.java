//Lab9.3
public class TestLocation {

	public static void main(String[] args) {
		int[][] matrix = {{4, 7, 3}, {6, 9, 1}, {2, 8, 5}, {-1, 20, 9}};
		System.out.println(findMaxLocation(matrix));
	}
	
	public static Location findMaxLocation(int[][] m) {
		Location maxLocation = new Location();
		maxLocation.maxValue = m[0][0];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > maxLocation.maxValue) {
					maxLocation.maxValue = m[i][j];
					maxLocation.row = i;
					maxLocation.column = j;
				}
			}
		}
		return maxLocation;
	}
}
