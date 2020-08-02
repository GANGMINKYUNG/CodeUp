import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//
		long p1 = Integer.parseInt(st.nextToken());
		long p2 = Integer.parseInt(st.nextToken());
		long p3 = Integer.parseInt(st.nextToken());
		int day = 1;
		
		while(day % p1 != 0 || day % p2 != 0 || day % p3 != 0)
		{
			day++;
		}
		
		System.out.println(day);
	}
}
