import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		//세로(h), 가로(w), 막대의 개수(n), 각 막대의 길이(l), 방향(d), 좌표(x, y)
		int height = scanner.nextInt();
		int width = scanner.nextInt();
		
		int[][] map = new int[height][width];
		
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int length = scanner.nextInt();
			int dir = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			if(dir == 0)
			{
				for(int j = y - 1; j < y - 1 + length; j++)
				{
					map[x-1][j] = 1;
				}
			}
			else
			{
				for(int j = x - 1; j < x - 1 + length; j++)
				{
					map[j][y-1] = 1;
				}
			}
		}
		
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}	
}