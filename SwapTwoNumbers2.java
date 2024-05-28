import java.util.Scanner;

//Swap two numbers without using third variable
public class SwapTwoNumbers2 {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre first number and second number:");
        firstNumber= sc.nextInt();
        secondNumber= sc.nextInt();

        firstNumber = firstNumber - secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber= secondNumber - firstNumber;

        System.out.println("After swap: " + "first number= " + firstNumber + " and " + "second number= " + secondNumber);


    }

}
