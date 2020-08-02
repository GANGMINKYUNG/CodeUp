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
		
		//시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int sum = a;
		
		for(int i = 1; i < n; i++)
		{
			sum += b;
		}
		
		System.out.println(sum);
	}
}
