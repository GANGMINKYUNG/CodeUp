import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= n; i++)
		{
		    for(int j = 1; j <= m; j++)
		    {
		        System.out.printf("%d %d\n", i, j);
		    }
		}
	}
}