package DSA;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth value of the factorial:");
		int n=sc.nextInt()	;
		System.out.println("Enter the rth value of the factorial:");
		int r=sc.nextInt()	;
		
		//for nfactorial
		int nfact=1;
		for (int i=1;i<=n;i++)
		{
			nfact *=i;
		}
		
		//for (n-r)!
		int nmrfact=1;
		for (int i=1;i<=n-r;i++)
		{
			nmrfact*=1;
		}
		   
		//now using main formula of factorial n!/(n-r)!
		
		int npr=nfact/nmrfact;
		
		System.out.println("The factorial of the "+n+"p"+r +"is"+"="+npr);
		
		
	}

}
