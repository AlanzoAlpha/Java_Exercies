package interation;

public class BlackJacks {

	public static int con1(int input1, int input2) {
		if (input1 > 21) input1 = 0;
		if (input2 > 21) input2 = 0;
		
		
		if (input1 > 21 && input2 > 21) {
			input1 = 0;
			input2 = 0;
		
		System.out.println("Zero");
		
		   
	return 0;
		}
		
	else if (input1 <= 21 && input1 <= 21) {
		
			System.out.println(Math.max(input1, input2));
	}
		return Math.max(input1, input2);
		
	

	}
	
	
	public static void main(String[] args) {
		con1(19, 23);
		
	}

}
