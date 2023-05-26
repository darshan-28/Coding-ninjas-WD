import java.util.Scanner;
class Pattern12 //pyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of lines u want Stars");

		int num=sc.nextInt();

		for (int i=1;i<=num ;i++ )
		{
			for (int star =num-1; star>=i-1;star-- )
			{
				System.out.print(" "+" ");
			}
			for (int space =1; space<=(i*2)-1;space++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
