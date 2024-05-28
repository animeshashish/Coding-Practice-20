import java.util.Scanner;
// swap two numbers using third variable

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int x, y, z; // x and y are to swap

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the value of x and y");
        x= sc.nextInt();
        y= sc.nextInt();

        // swapping
        z = x;
        x = y;
        y = z;
        System.out.println("After swapping numbers:" + "x= " + x + " and " +"y= " + y);

    }
}
