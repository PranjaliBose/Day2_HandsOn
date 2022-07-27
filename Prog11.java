import java.util.Scanner;
public class Prog11 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter a number : "); 
		int n=sc.nextInt(); 
		int flag=0,i=2;
		while(i<=n/2) 
		{
			if(n%2==0)
			{
				flag++;
				break;
			}
			i++;
			
		}
		if(flag==0)
		{
			System.out.println("Number is a Prime number"); 
		}
		else
		{
			System.out.println("Number is not a Prime number"); 
			
		}
			
	
	}

}
