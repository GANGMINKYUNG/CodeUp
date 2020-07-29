import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String myNum = scanner.nextLine();
        scanner.close();
        
        StringTokenizer token = new StringTokenizer(myNum, "-");
        
        while(token.hasMoreTokens())
        {
            System.out.print(token.nextToken());
        }
    }
}