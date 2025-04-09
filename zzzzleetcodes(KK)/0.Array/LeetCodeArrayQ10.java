import java.util.Scanner;

class LeetCodeArrayQ10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the Sentence : ");
        String sentence = scanner.nextLine();
        scanner.close();

        boolean answer = cheakpangram(sentence);
        if (answer == true) {
            System.out.println(sentence + ":- is a valid Pangram");
        } else {
            System.out.println(sentence + ":- is not a valid Pangram");
        }

    }

    public static boolean cheakpangram(String sentence) {
        boolean[] seen = new boolean[26];

        sentence = sentence.toLowerCase();

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                seen[index] = true;
            }
        }

        for (boolean b : seen) {
            if (b != true) {
                return false;
            }
        }

        return true;
    }
}
