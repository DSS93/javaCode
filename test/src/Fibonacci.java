import java.lang.Object;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {

        int  t1 = 0, t2 = 1;
        System.out.print("Enter value");
        int n = new Scanner(System.in).nextInt();
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " , ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

}
