
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char stack[] = new char[100];
        int top = -1;

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Push characters into Stack
        for (int i = 0; i < str.length(); i++) {

            top++;
            stack[top] = str.charAt(i);
        }

        // Pop characters and create reverse String
        String reverse = "";

        while (top != -1) {

            reverse = reverse + stack[top];
            top--;
        }

        // Check Palindrome
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not a Palindrome String");
        }

        sc.close();
    }
}
