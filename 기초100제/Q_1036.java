import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String data = scanner.nextLine();
		scanner.close();
		
		int result = data.charAt(0);
		
		System.out.println(result);
	}
}