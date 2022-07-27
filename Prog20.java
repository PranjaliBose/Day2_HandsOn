import java.util.Scanner;

public class Prog20 {

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
		System.out.println("Enter element you want to search for  : ");
		int item=sc.nextInt();
		int flag=0,i=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]==item)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("Element found at position : "+i);
			
		}
		else
		{
			System.out.println("-1");
		}

	}

}
