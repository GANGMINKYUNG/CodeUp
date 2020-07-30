import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	
		
		int data = scanner.nextInt();
		scanner.close();
		
		if(data < 0)
		{
		    System.out.println("minus");
		    
		    if(data % 2 == 0)
		    {
		        System.out.println("even");
		    }
		    else
		    {
		        System.out.println("odd");
		    }
		}
		else
		{
		    System.out.println("plus");
		    
		    if(data % 2 == 0)
		    {
		        System.out.println("even");
		    }
		    else
		    {
		        System.out.println("odd");
		    }
		}
	}
}