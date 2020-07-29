import java.util.Scanner;
import java.util.StringTokenizer;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String time = scanner.nextLine();
        scanner.close();
        
        StringTokenizer token = new StringTokenizer(time, ":");
        
        int arr[] = new int[3];
        int i = 0;
        while(token.hasMoreTokens())
        {
            arr[i] = Integer.parseInt(token.nextToken());
            i++;
        }
        
        System.out.println(arr[1]);
    }
}