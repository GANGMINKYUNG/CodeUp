import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		long data = scanner.nextLong();
		scanner.close();
		
		long result = data << 1;
		
		System.out.println(result);
	}
}