import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String hexStr = scanner.next();
		
		int hexData = Integer.parseInt(hexStr, 16);
		
		for(int i = 1; i <= 15; i++)
		{
			System.out.printf("%X*%X=%X\n", hexData, i, (hexData*i));
		}
	}
}