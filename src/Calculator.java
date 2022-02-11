import java.util.Scanner;


public class Calculator {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers on different lines to add them togethher");
		
		int one = input.nextInt();
		int two = input.nextInt();
		
		int sum = one + two;
		
		System.out.print(sum);
		
	}
}
