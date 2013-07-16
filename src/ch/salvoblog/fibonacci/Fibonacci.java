package ch.salvoblog.fibonacci;

public class Fibonacci {
	
	private int regular;
	private int fibonacci;
	
	public Fibonacci (int regular) {
		this.regular = regular;
	}
	
	public int getFibonacci () {
		if (regular<2) {
			return regular;
		} else {
			fibonacci = (regular-1) + (regular-2);
			return fibonacci;
		}
	}

}
