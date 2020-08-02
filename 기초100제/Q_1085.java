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
		
		//소리강약 체크(h), 비트(b), 채널(c), 녹음시간(s)
		long h = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		long s = Integer.parseInt(st.nextToken());
		
		double resByte = (h * b * c * s) / 8;
		double resMb = (resByte / Math.pow(2, 10) / Math.pow(2, 10));
		System.out.printf("%.1f MB", resMb);
	}
}
