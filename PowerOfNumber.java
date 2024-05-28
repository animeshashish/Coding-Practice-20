import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        int base;
        int exponent;
        int result = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre base and exponent:");
        base= sc.nextInt();
        exponent= sc.nextInt();

        for (int i =0; i < exponent; i++) {
            result*= base;

        }
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}
