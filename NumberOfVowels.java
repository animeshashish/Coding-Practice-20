import java.util.Scanner;

public class NumberOfVowels {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Entre a sentence or word:");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        for (int i=0; i<sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("The number of vowels in the sentence is " + count);
    }
}
