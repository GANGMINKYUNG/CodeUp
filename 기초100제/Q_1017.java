import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        for(int i = 0; i < 3; i++)
        {
            System.out.format("%d ", a);
        }
        scanner.close();
    }
}