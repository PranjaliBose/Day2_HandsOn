import java.util.Scanner;
public class Prog16 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int rev=0;
		int n1=n;
		while(n>0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(n1==rev)
		{
			System.out.println("Number is a Palindrome.");
		}
		else
		{
			System.out.println("Number is not a Palindrome.");
		}

	}

}
