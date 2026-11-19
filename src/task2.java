import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    count = count + 1;
                }
            }
        }
        System.out.println("Consonants = " + count);
    }
}
