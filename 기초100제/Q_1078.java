import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	
		
		int data = scanner.nextInt();
		scanner.close();
		
		int sum = 0;
		
		for(int i = 1; i <= data; i++)
		{
		    if(i % 2 == 0)
		    {
		        sum += i;
		    }
		}
		
		System.out.println(sum);
	}
}