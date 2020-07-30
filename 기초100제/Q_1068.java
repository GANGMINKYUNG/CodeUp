import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int data = scanner.nextInt();
		scanner.close();
		
		if(data >= 90)
		{
		    System.out.println("A");
		}
		else if(data >= 70 && data < 90)
		{
		    System.out.println("B");
		}
		else if(data >= 40 && data < 70)
		{
		    System.out.println("C");
		}
		else
		{
		    System.out.println("D");
		}
	}
}