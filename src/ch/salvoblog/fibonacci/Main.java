package ch.salvoblog.fibonacci;

public class Main {
	
	public static void main(String[] args) {
		
		boolean menuLoop = true;
		
		while(menuLoop) {
			System.out.println ("Enter the number you would like to convert to a Fibonacci number: ");
			Fibonacci value = new Fibonacci (Terminal.readInt());
	
			System.out.println ("The converted number: ");
			System.out.println (value.getFibonacci());
			
			System.out.println ("Convert another number?");
			menuLoop = Terminal.readBool();
		}
	}

}
