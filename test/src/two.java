
public class two {
	public static void main(String[] args) {
		int number = 15;
		for(int i = 0; i < number; i++) {
			for(int j = 0; j < number; j++) {
				if (i==j || i+j==number-1) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println("");
		}
	}
}
