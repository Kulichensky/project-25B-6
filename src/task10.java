import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                current = current + c;
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
