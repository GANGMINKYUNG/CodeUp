import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	
		
		int n = scanner.nextInt();
		int data[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
		    data[i] = scanner.nextInt();
		}
		scanner.close();
		
		for(int i = 0; i < n; i++)
		{
		    System.out.println(data[i]);
		}
	}
}