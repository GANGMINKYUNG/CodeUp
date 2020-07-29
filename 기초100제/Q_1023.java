import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String data = scanner.nextLine();
        scanner.close();
        
        StringTokenizer token = new StringTokenizer(data, ".");
        while(token.hasMoreTokens())
        {
            System.out.println(token.nextToken());
        }
    }
}