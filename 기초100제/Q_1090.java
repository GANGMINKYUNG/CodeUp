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
		
		//시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)
		long a = Integer.parseInt(st.nextToken());
		long r = Integer.parseInt(st.nextToken());
		long n = Integer.parseInt(st.nextToken());
		long mul = a;
		
		for(int i = 1; i < n; i++)
		{
			mul *= r;
		}
		
		System.out.println(mul);
	}
}
