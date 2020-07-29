import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String date = scanner.nextLine();
        scanner.close();
        
        StringTokenizer token = new StringTokenizer(date, ".");
        
        int arr[] = new int[3];
        int i = 0;
        while(token.hasMoreTokens())
        {
            arr[i] = Integer.parseInt(token.nextToken());
            i++;
        }
        
        System.out.format("%02d-%02d-%04d\n", arr[2], arr[1], arr[0]);
    }
}