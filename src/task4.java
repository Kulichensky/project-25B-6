import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if (s.length() == 0) {
            System.out.println("Words = 0");
            return;
        }
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count = count + 1;
            }
        }
        System.out.println("Words = " + count);
    }
}
