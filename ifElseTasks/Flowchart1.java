package interation;

public class Method3p {

	public static int par3(int A, int B, boolean C) {
		if (C) {
			System.out.println("C is true");
			return A + B;
		}
		

		else {
			System.out.println("C is not true");
			return A * B;
		}

		

	}

	public static void main(String[] args) {
		par3(10, 20, false);
	}
}

