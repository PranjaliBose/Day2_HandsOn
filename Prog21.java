import java.util.Scanner;

public class Prog21{

	public static void main(String[] args) 

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i=0; i<n; i++) 
		{
			System.out.print((char)arr[i]+" ");
		}

			System.out.println();

	}

}