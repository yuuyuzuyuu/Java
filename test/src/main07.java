
public class main07 {
	public static void main(String[] args) {
		int size = 3;
		for(int i = 0; i < size; i++) {
			for(int a = 0; a < i ;a++) {
				System.out.print(" ");
			}
			for(int b = 0; b < (size - i ) * 2 - 1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
