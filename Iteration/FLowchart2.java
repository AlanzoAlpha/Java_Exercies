package interation;

public class FLowchart2 {
	public static void main(String[] args) {

	int A = 100;
	
	do {
		System.out.println("Flowchart");
		A++;

		if (A % 2 == 0) {
			System.out.println("-");

		} else {
			System.out.println("*");

		}
	}while (A <= 200);

			System.out.println(A);
		
	}

}
