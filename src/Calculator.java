import java.util.Scanner;


public class Calculator {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers on different lines");
		
		int one = input.nextInt();
		int two = input.nextInt();
		int answer = 0;
		
		System.out.println("Do you want to add, subtract, multiply, or divide?");
		String response = input.nextLine();
		response = input.nextLine();
		
		if (response.equalsIgnoreCase("add")) {
			answer = one + two;
		}
		
		else if (response.equalsIgnoreCase("subtract")) {
			answer = one - two;
		}
		
		else if (response.equalsIgnoreCase("multiply")) {
			answer = one * two;
		}
		
		else if (response.equalsIgnoreCase("divide")) {
			answer = one / two;
		}
			
		
		
		System.out.print(answer);
		
	}
}
