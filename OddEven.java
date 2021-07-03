package DSA;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check odd or even:");
		int n=sc.nextInt()	;
		int a=n;
		if(n==0)
		{System.out.println("The number is even");}
		else if(n==3)
		{
			System.out.println("The number is odd");
		}
		else if(n==5)
		{
			System.out.println("hi buddy");
		}
		else
		{
			System.out.println("HELLO");
		}
	}

}
