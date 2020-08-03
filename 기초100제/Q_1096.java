import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] map = new int[20][20];
		int x, y = 0;
		
		for(int i = 1; i<= n; i++)
		{
			x = sc.nextInt();
			y = sc.nextInt();
			
			map[x][y] = 1;
		}
		
		for(int i = 1; i <= 19; i++)
		{
			for(int j = 1; j <= 19; j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
