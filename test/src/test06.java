
public class test06 {
	public static void main(String[] args) {
		int size = 3;
		for(int a = 0; a < size; a++) {
			for(int b = 0; b < size - (a + 1); b++) {
				System.out.print(" ");
			}
			for(int c = 0; c < (a + 1) * 2 - 1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
