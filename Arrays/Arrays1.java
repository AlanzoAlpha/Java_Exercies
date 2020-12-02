//Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
package interation;

public class Arrays {
	
	public static void array1() {
		int[] Array1; //Creating an array of integers
	    Array1 = new int[10]; //assigning 10 integers
	    
	    
	    // assign a value to each array element and print 
	    for (int i = 0; i < Array1.length; i++) {
            Array1[i] = i;
            
            System.out.print(Array1[i] + " ");
            
	    }
	}
        
    public static void main(String[] args) {
            array1();
    
    }
    
}

