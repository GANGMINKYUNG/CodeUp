import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String time = scanner.nextLine();
        scanner.close();
        
        System.out.print(time);
    }
}