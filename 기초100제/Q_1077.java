import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	
		
		int data = scanner.nextInt();
		scanner.close();
		
		int i = 0;
		while(i <= data)
		{
		    System.out.println(i);
		    i++;
		}
	}
}