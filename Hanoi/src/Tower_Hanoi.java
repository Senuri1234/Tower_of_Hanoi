
public class Tower_Hanoi {

	

	    // Method to solve the Tower of Hanoi problem
	    public static void solveTowerOfHanoi(int n, char source, char auxiliary, char destination) {
	        // Print instructions to solve the Tower of Hanoi problem
	        System.out.println("Solving Tower of Hanoi for " + n + " disks:");
	        moveDisks(n, source, auxiliary, destination);
	    }

	    // Recursive method to move disks
	    private static void moveDisks(int n, char source, char auxiliary, char destination) {
	        if (n == 1) {
	            // Base case: Move one disk directly
	            System.out.println("Move disk 1 from " + source + " to " + destination);
	            return;
	        }
	        // Move n-1 disks from source to auxiliary, using destination as auxiliary
	        moveDisks(n - 1, source, destination, auxiliary);
	        // Move the nth disk from source to destination
	        System.out.println("Move disk " + n + " from " + source + " to " + destination);
	        // Move the n-1 disks from auxiliary to destination, using source as auxiliary
	        moveDisks(n - 1, auxiliary, source, destination);
	    }

	    // Main method to test the Tower of Hanoi solution
	    public static void main(String[] args) {
	        int numberOfDisks = 3;  // Number of disks
	        char sourceRod = 'A';   // The source rod
	        char auxiliaryRod = 'B'; // The auxiliary rod
	        char destinationRod = 'C'; // The destination rod

	        // Call the method to solve Tower of Hanoi
	        solveTowerOfHanoi(numberOfDisks, sourceRod, auxiliaryRod, destinationRod);
	    }
	}


