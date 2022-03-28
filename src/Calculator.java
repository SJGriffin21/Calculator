import java.util.Scanner;


public class Calculator {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers on different lines");
		
		double one = input.nextDouble();
		double two = input.nextDouble();
		double answer = 0;
		
		
		System.out.println("Do you want to add, subtract, multiply, or divide?");
		String response = input.nextLine();
		response = input.nextLine();
		
		if (response.equalsIgnoreCase("add")) {
			answer = one + two;
			System.out.print(answer);
		}
		
		else if (response.equalsIgnoreCase("subtract")) {
			answer = one - two;
			System.out.print(answer);
		}
		
		else if (response.equalsIgnoreCase("multiply")) {
			answer = one * two;
			System.out.print(answer);
		}
		
		else if (response.equalsIgnoreCase("divide")) {
			if (two == 0) {
				System.out.println("Error: Divide by Zero");
			}
			else {
				answer = one / two;
				System.out.print(answer);
			}
				
		}
		System.out.println("Goodbye!");
	}
}
