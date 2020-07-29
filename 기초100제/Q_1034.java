import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		 		 
		 String data = scanner.nextLine();
		 scanner.close();
		 
		 int octalData = Integer.valueOf(data, 8);
		 
		 System.out.println(octalData);
	}
}