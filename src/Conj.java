import java.util.Scanner;


public class Conj 
{
	

	public static void main(String[] args) 
 	{
		System.out.println("Please enter the n value");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(n);
		while(n!=1)
		{
		if(n%2==0)
			n=n/2;
		else
			n=((3*n)+1);
		System.out.println(n);
		}
      	
 	}

}
