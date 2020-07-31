import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			char data = scanner.next().charAt(0);
		    
		    if(data == 'q')
		    {
		    	System.out.println(data);
		        break;
		    }
		    
		    System.out.println(data);
		}
	}
}