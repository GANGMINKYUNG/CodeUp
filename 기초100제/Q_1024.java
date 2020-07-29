import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String data = scanner.nextLine();
        scanner.close();
        
        for(int i = 0; i < data.length(); i++)
        {
            System.out.format("\'%s\'\n", data.charAt(i));
        }
    }
}