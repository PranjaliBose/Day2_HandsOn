import java.util.Scanner;

public class Prog12 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first limit : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second limit : ");
		int n2 = sc.nextInt();
		int f=0;
		for (int i=n1;i<=n2;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				f++;
			}
			if(f==2)
			System.out.print(i +" ");

		}
	}
}