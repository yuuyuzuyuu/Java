
public class main06 {
	public static void main(String[] args) {
		int size = 5;
		for(int i = 0; i < size; i++) {
			for(int a = 0; a < size - (i+1); a++) {
				System.out.print(" ");
			}
			for(int b = 0; b < (i + 1) * 2 -1;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
