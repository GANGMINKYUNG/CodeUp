import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	
		
		int n = scanner.nextInt();
		int sum = 0;
		int cnt = 0;
		
		for(int i = 1; i <= n; i++)
		{
		    sum += i;
		    cnt++;
		    
		    if(sum >= n)
		    {
		        System.out.println(cnt);
		        break;
		    }
		}
		scanner.close();
	}
}