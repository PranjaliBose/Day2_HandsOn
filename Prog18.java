import java.util.Scanner;

public class Prog18 {

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
		int sum=0,avg;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		
			
		}
		avg=sum/n;
		System.out.println("The sum of the elements in the array : "+sum);
		System.out.println("The average of the elements in the array : "+avg);
		

	}

}
