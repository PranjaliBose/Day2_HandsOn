import java.util.Scanner;

public class Prog17 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x=sc.nextInt();
		System.out.println("Enter second number: ");
		int y=sc.nextInt();
		for(int i=x;i<=y;i++)
		{
			if(i%2==0 ||i%3==0 ||i%5==0)
			{
				System.out.println(i);
			}
		}

	}

}
