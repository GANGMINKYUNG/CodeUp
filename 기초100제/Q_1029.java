import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
		 
		 double data = scanner.nextDouble();
		 
		 System.out.format("%.11f", data);
		 scanner.close();
	}
}
