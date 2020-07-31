import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		char alpa = scanner.nextLine().charAt(0);
		int i_alpa = (char)alpa;
		
		int i = 97;
		while(i <= i_alpa)
		{
		    System.out.println((char)i);
		    i++;
		}
		scanner.close();
		
	}
}