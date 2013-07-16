package ch.salvoblog.fibonacci;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println ("Enter the number you would like to convert to a Fibonacci number: ");
		Fibonacci value = new Fibonacci (Terminal.readInt());

		System.out.println ("The converted number: ");
		System.out.println (value.getFibonacci());
	}

}
