
public class main05 {
	public static void main(String[] args) {
		int size = 3;
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size-(i+1); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<(i+1)*2-1; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
