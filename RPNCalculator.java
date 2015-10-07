import java.util.Scanner;

public class RPNCalculator {
	
	public static void main(String[] args) throws Exception {
		
		String line;
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter your desired numbers: ");
		line = in.nextLine(); 
		SimpleStack<String> stack = new SimpleStack<String>();
		do {
		
			if (line.indexOf(" ") == -1) {
				
				stack.push(line);
				line = "";
				
			}
			
			else {
				
				stack.push(line.substring(0, line.indexOf(" ")));
				line = line.substring(line.indexOf(" ") + 1, line.length());
				
			}
		    
		} while(line.length() > 0);
		
		int length = stack.size();
		String popped = "";
		int total = 0;
/*		SimpleStack<String> operations = new SimpleStack<String>();
		SimpleStack<String> numbers = new SimpleStack<String>();
		
		for (int i = 0; i < length; i++) {

		  popped = stack.pop();

		  if (popped.equals("/") || popped.equals("*") || popped.equals("+") || popped.equals("-")) {
			  operations.push(popped);
		  }
			  
		  else {
			  
			  numbers.push(popped);
			  
		  }
			
		}

		try {
			
		}catch (NumberFormatException e) {
			
		}*/
		
		String[] operations = new String[length];
		int operationsCounter = 0;
		for (int i = 0; i < length; i++) {
			
			popped = stack.pop();
			
			if (popped.equals("/") || popped.equals("*") || popped.equals("+") || popped.equals("-")) {
				operations[operationsCounter] = popped;
				operationsCounter++;
			}
		}
		
	}
}