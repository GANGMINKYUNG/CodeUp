import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int data = scanner.nextInt();
        scanner.close();
        
        String hexStr = Integer.toHexString(data);
        
        System.out.println(hexStr);
    }
}