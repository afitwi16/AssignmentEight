    import java.util.Scanner;

    public class DNA {

        public static void main(String[] args) {
            StringBuilder builder = new StringBuilder();
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the DNA word");
            String str=input.next();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (str.charAt(i) == 'T') {
                    builder.append('A');
                }
                if (str.charAt(i) == 'A') {
                    builder.append('T');
                }
                if (str.charAt(i) == 'C') {
                    builder.append('G');
                }
                if (str.charAt(i) == 'G') {
                    builder.append('C');
                }
            }


            System.out.println( builder.toString());


        }
    }


