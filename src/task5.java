import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("None");
    }
}
