import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);
		 
	    String data = scanner.nextLine();
	    scanner.close();
		 
	    int vInt = Integer.parseUnsignedInt(data);
	    String sInt = Integer.toUnsignedString(vInt);
		 
	    System.out.println(sInt);
	}
}