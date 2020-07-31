import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int data = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= data; i++)
		{   
		    if(i % 3 == 0)
		    {
		        System.out.printf("%c ", 'X');
		    }
		    else
		    {
		    	System.out.printf("%d ", i);
		    }
		}
	}
}