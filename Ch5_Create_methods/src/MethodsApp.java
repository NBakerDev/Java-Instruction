import java.util.Scanner;

public class MethodsApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter #: ");
		int n1 = sc.nextInt();
		System.out.println("Enter another #: ");
		int n2 = sc.nextInt();
		int sum = sumIt(n1, n2);
		System.out.println("Sum = "+ sum);
	}
	private static int sumIt(int a, int b) {
		return a + b;
	}
	private static int sumIt(int a, int b, int c) {
		return a + b + c;
	}
	private static int sumIt(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}
