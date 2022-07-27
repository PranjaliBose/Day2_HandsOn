import java.util.Scanner;

public class Prog19 {

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
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The largest element in the array is : "+max);
		System.out.println(max);
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]<max)
			{
				min=arr[i];
			}
		}
		System.out.println("The largest element in the array is : "+min);
		System.out.println(min);
		
		

	}

}
