import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		 		 
		 String data = scanner.nextLine();
		 scanner.close();
		 
		 int hexData = Integer.parseInt(data, 16);
		 
		 String octalStr = Integer.toOctalString(hexData);
		 
		 System.out.println(octalStr);
	}
}