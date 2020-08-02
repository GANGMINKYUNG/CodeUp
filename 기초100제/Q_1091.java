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
		
		//시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)
		long a = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
		long d = Integer.parseInt(st.nextToken());
		long n = Integer.parseInt(st.nextToken());
		long result = a;
		
		for(int i = 1; i < n; i++)
		{
			result = (result * m) + d;
		}
		
		System.out.println(result);
	}
}
