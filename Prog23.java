import java.util.Scanner;
public class Prog23 {

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
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Smallest 2 Numbers. : "+arr[0]+" , "+arr[1]);
		System.out.println("Largest 2 Numbers : "+arr[n-1]+" , "+arr[n-2]);
	}

}
