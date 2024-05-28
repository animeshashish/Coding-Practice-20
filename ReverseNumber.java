import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int x, reverse= 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a number:");
        x= sc.nextInt();

        for (;x!= 0; x= x/10) {
        int remainder = x%10;
        reverse = reverse*10+remainder;
}
        System.out.println("The reverse of given number is:" + reverse);
    }
}
