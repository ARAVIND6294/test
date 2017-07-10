import java.util.Scanner;


public class FIB 
{

	public static void fibonacci(int n)
	{
		if(n==0)
		{
			System.out.println("0");
		}
		else if(n==1)
		{
			System.out.println("0 1");
		}
		else
		{
			System.out.println("0 1");
			int n1=0;
			int n2=1;
			for(int i=1;i<=n;i++)
			{
				int n3=n1+n2;
				System.out.println(n3 +" ");
				n1=n2;
				n2=n3;
			}
		}
	}
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the value of n:");
	  int n=s.nextInt();
	  fibonacci(n);

	}

}
