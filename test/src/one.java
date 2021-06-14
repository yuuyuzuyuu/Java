
public class one {
	public static void main(String[] args) {
		int number = 10;
		for (int i = 0; i < number; i ++) {
			for (int j = 0; j < number; j++) {
				if ((i+j) % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}
