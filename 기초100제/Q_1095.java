import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] number = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			number[i] = scanner.nextInt();
		}
		
		Arrays.sort(number);
		
		System.out.println(number[0]);
	}
}
