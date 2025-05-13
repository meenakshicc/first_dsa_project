/**
 * BananaCoconut class. 
 */
public class BananaCoconut {
	/**
	 * The main method takes command line arguments and replaces certain numbers with words. Checks whether the command line arguments are valid and catches an exception otherwise.
	 * Prints the matching word for the numbers from the command line arguments.
	 * @param args for the command line arguments
	 */
	public static void main(String[] args) {
		int numofargs = args.length; 
		if (numofargs > 0) {
			
			for (int i = 0; i < numofargs; i++) {
				try {
					int value = Integer.parseInt(args[i]);
				}
				catch (Exception e) {
					System.err.println("One or more numbers required as a command line argument.");
					System.err.print("Example Usage: java BananaCoconut [number] [number] [...]");
					return;
				}
			}
		}
		if (numofargs == 0) {
			System.err.println("One or more numbers required as a command line argument.");
			System.err.print("Example Usage: java BananaCoconut [number] [number] [...]");
		}
		
		if (numofargs > 0) {
			
			for (int i = 0; i < numofargs; i++) {
				int value = Integer.parseInt(args[i]);
				if (value < 1) {
					System.out.print("puttputt");
				}
				else if (value % 21 == 0) {
					System.out.print("banana-coconut");
				}
				else if (value % 3 == 0) {
					System.out.print("banana");
				}
				else if (value % 7 == 0) {
					System.out.print("coconut");
				}
				else {
					System.out.print(args[i]);
				}
				if (i < args.length - 1) {
					System.out.print(" ");
				}
			}
			
		}
		
	}
}