import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		long data1 = scanner.nextLong();
		long data2 = scanner.nextLong();
		long data3 = scanner.nextLong();
		scanner.close();
		
		long sum = data1 + data2 + data3;
		float avg = (float)sum / 3;
		
		System.out.printf("%d\n%.1f\n", sum, avg);	
	}
}