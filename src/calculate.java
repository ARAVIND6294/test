import java.util.Scanner;
//first change

public class calculate 
{

	public static void main(String[] args) 
	{
		System.out.println("please enter the number of values:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		double avg = 0;
		int sum=0;
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			int n0=s.nextInt();
			if(n0>max)
			{
				max=n0;
			}
			if(n0<min)
			{
				min=n0;
			}
			
				sum=sum+n0;
				avg=(double)sum/n;

		}
		System.out.println("largest of N numbers is:" + max);
		System.out.println("smallest of N numbers is:" + min);
		System.out.println("average of N numbers is:" + avg);
		
	}

}
