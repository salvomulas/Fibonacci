package ch.salvoblog.fibonacci;

public class Fibonacci {
	
	// Class attributes
	private int regular;
	private int fibonacci;
	
	// Class constructor
	public Fibonacci (int regular) {
		this.regular = regular;
	}
	
	// Class methods
	public int getFibonacci () {
		if (regular<2) {
			return regular;
		} else {
			fibonacci = (regular-1) + (regular-2);
			return fibonacci;
		}
	}

}
