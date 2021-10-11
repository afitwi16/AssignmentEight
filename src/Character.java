import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("please enter a String");
        String str = input.next();
        isUpperCase(str);
        System.out.println(isUpperCase(str));
    }
    public static boolean isUpperCase(String str)
    {

        int count=0;
        for (int i=0; i < str.length(); i++ )
        {
            char c = str.charAt(i);

            if (str.charAt(i) >=65 && str.charAt(i) <=90)
            {
                count++;
                System.out.print("'" +c + "'") ;

            }

        }

        System.out.println("  Count of uppercase  :" + count);
        return true;

    }

}


