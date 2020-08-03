import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	
		
		int n = scanner.nextInt();
		int[] sayN = new int[n];
		
		for(int i = 0; i < n; i++)
		{
		    sayN[i] = scanner.nextInt();
		}
		
		for(int i = n - 1; i >= 0; i--)
		{
		    System.out.print(sayN[i] + " ");
		}
		
		scanner.close();
	}
}