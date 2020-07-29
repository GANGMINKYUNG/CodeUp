import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		long data1 = scanner.nextLong();
		long data2 = scanner.nextLong();
		scanner.close();
		
		long resAdd = data1 + data2;
		long resSub = data1 - data2;
		long resMul = data1 * data2;
		long resDiv = data1 / data2;
		long resMod = data1 % data2;
		float resDivMod = (float)data1 / (float)data2;
		
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f\n", resAdd, resSub, resMul, resDiv, resMod, resDivMod);
	}
}