package calculator;
import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number ");
		int x = sc.nextInt();
		System.out.println("Enter 2nd number");
		int y = sc.nextInt();
		int a = x + y;
		System.out.println("the addition of " +x+ " and " +y+ " is " +a);
		int b = x - y;
		System.out.println("the subtraction of " +x+ " and " +y+ " is " +b);
		int c = x * y;
		System.out.println("the muliplication of " +x+ " and " +y+ " is " +c);
		double d = x / y;
		System.out.println("the division of " +x+ " and " +y+ " is " +d);
		int e = x % y;
		System.out.println("the modulo of " +x+ " and " +y+ " is " +e);
		
		sc.close();
	}
}