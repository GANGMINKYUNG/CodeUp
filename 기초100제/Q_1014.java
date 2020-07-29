import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        
        System.out.format("%s %s", b, a);
    }
}