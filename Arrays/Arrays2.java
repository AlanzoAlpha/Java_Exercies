/*Create a for loop that populates an integer array with values, outputting them at each iteration.
Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.
*/

package interation;

public class Arrays2 {

	public static void array1() {
		int[] Array1; //Creating an array of integers
	    Array1 = new int[10]; //assigning 10 integers
	    
	    
	    // assign a value to each array element and print 
	    for (int i = 0; i < Array1.length; i++) {
            Array1[i] = i;
            
            System.out.print(Array1[i] + " ");
            
	    }
	    
	    for (int i = 0; i < Array1.length; i++) {
            Array1[i] = i*10;
            
            System.out.print("\n" + Array1[i] + " ");
            
	    }
	}
        
    public static void main(String[] args) {
            array1();
    
    }
    
}

