import java.util.Scanner;

public class Repetitions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int n = scanner.nextInt();

        System.out.println(s);

        for (int i = 1; i < n; i++)
            System.out.println(s);
    }
}
