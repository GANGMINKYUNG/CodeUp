import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.close();
		
		for(int i = n - 1; i >= 0; i--)
		{
		    System.out.println(i);
		}
	}
}