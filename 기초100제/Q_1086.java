import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//가로pixcle(w), 세로pixcle(h), 비트(b)
		long w = Integer.parseInt(st.nextToken());
		long h = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		double resByte = (w * h * b) / 8;
		double resMb = (resByte / Math.pow(2, 10) / Math.pow(2, 10));
		System.out.printf("%.2f MB", resMb);
	}
}
