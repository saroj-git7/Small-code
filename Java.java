package DSA;

public class Java {
	public static  void display(int n,int r)
	{
		int s=n*r;
		System.out.println("The input number are ="+n +"," +r);
	}
	
	public  static int fact(int x ) //function using void only
	{
		int var=x*x;
		return var;
	
	}
	

	public static void main(String[] args) {
	
		fact(3);
		display(4,6);
		System.out.println();
	}

}
