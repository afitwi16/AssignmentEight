  import java.util.Scanner;

    public class Palindrome {

        public static void main(String args[]) {
            String str, rev = "";
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a string:");
            str = input.nextLine();
            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            if (str.equals(rev))
                System.out.println(str + " is a palindrome");
            else
                System.out.println(str + " is not a palindrome");

        }
    }



