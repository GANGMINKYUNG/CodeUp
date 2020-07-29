import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       
       int data = scanner.nextInt();
       scanner.close();
       
       int arr[] = new int[5];
       for(int i = 4; i >= 0; i--)
       {
           arr[i] = data % 10;
           data /= 10;
       }
       
       for(int i = 0; i < 5; i++)
       {
           int pow = (int)Math.pow(10, 4 - i);
           System.out.println("[" + arr[i] * pow + "]");
       }
    }
}