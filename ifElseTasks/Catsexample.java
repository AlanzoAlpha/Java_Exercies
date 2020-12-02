package interation;

public class ifelse {

	public static int catCount = 0;
	
	public static boolean notEnoughCats = true;

	public static void main(String[] args) {
		while (notEnoughCats) {
			System.out.println("Another cat");
			catCount++;

			if (catCount > 273) {
				notEnoughCats = false;
			}
		}

		System.out.println("Too many cats what do I do");
	}

}
