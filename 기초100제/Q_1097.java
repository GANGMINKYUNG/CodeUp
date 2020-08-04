import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		int[][] map = new int[20][20];
		
		for(int i = 0; i< 19; i++)
		{
			for(int j = 0; j < 19; j++)
			{
				map[i][j] = scanner.nextInt();
			}
		}
		
		int n = scanner.nextInt();
		int x, y = 0;
		
		for(int i = 0; i < n; i++)
		{
			x = scanner.nextInt();
			
			for(int j = 0; j < 19; j++)
			{
				if(map[x - 1][j] == 0)
				{
					map[x - 1][j] = 1;
				}
				else
				{
					map[x - 1][j] = 0;
				}
			}
			
			y = scanner.nextInt();
			
			for(int j = 0; j < 19; j++)
			{
				if(map[j][y - 1] == 0)
				{
					map[j][y - 1] = 1;
				}
				else
				{
					map[j][y - 1] = 0;
				}
			}
		}
		for(int i = 0; i< 19; i++)
		{
			for(int j = 0; j < 19; j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}	
}
