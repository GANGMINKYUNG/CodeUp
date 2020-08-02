import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int r = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < g; j++)
			{
				String str = "";
				for(int k = 0; k < b; k++)
				{
					str += i + " " + j + " " + k + "\n";
					cnt++;
				}
				bw.write(str);
				bw.flush();
			}
		}
		System.out.println(cnt);
		bw.close();
	}
}
