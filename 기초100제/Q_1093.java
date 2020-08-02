import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int sayN;
		int[] number = new int[24];
		
		for(int i = 0; i < n; i++)
		{
			sayN = scanner.nextInt();
			number[sayN] += 1;
		}
		
		for(int i = 1; i < number.length; i++)
		{
			System.out.printf("%d ", number[i]);
		}
	}
}
