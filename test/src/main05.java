
public class main05 {
	public static void main(String[] args) {
		int number = 3;
		for(int i = 0; i < number; i ++) {
			for(int s = 0; s < number-(i+1); s++) {
				System.out.print(" ");
			}
			for(int k = 0; k< (i+1)*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int size = 3;
		for (int a = 0; a < size; a++) {
			for (int b = 0; b < a; b++) {
				System.out.print(" ");
			}
			for (int c = 0; c < (size-a)*2-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
