import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		int[][] map = new int[10][10];
		
		//map 생성
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				map[i][j] = scanner.nextInt();
			}
		}
		
		//개미(2,2)에 있고 오른쪽으로 이동[y값 변경], 벽(1)나오면 아래로[x값 변경],
		// 먹이(2)나오거나 멥 오른쪽 알일시 멈춤[break].
		boolean status = true;
		int x = 1;
		int y = 1;
		
		while(status)
		{
			for(int i = x; i < map.length; i++)
			{
				for(int j = y; j < map.length; j++)
				{
					if(map[i][j] == 0)
					{
						map[i][j] = 9;
						y++;
					}
					else if(map[i][j] == 1)
					{
						x++;
						y--;
						break;
					}
					else if(map[i][j] == 2)
					{
						map[i][j] = 9;
						status = false;
					}
				}
				if(!status)
				{
					break;
				}
			}
		}
		
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map.length; j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}	
}

