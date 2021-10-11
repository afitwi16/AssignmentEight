
public class CountingVowels {

        public static void main(String[] args) {
            String str = "Mary has a little lamp";

            int[] count = new int[5];
            //int[] count= {'a','e','i', 'o','u'};

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a') {
                    count[0]++;
                } else if (ch == 'e') {
                    count[1]++;
                } else if (ch == 'i' || ch == 'I') {
                    count[2]++;
                } else if (ch == 'o' || ch == 'O') {
                    count[3]++;
                } else if (ch == 'u' || ch == 'U') {
                    count[4]++;
                }
            }

            System.out.println("# of 'a' = " + count[0]);
            System.out.println("# of 'e' = " + count[1]);
            System.out.println("# of 'i' = " + count[2]);
            System.out.println("# of 'o' = " + count[3]);
            System.out.println("# of 'u' = " + count[4]);
        }
    }


