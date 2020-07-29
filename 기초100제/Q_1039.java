import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		 		 
		 long data1 = scanner.nextLong();
		 long data2 = scanner.nextLong();
		 scanner.close();
		 
		 long result = data1 + data2;
		 
		 System.out.println(result);
	}
}