import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	
		
		int data1 = scanner.nextInt();
		int data2 = scanner.nextInt();
	    scanner.close();
	    
	    int result = data1 << data2;
	    
	    System.out.println(result);
	}
}