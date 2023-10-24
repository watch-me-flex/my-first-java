import java.util.Scanner;

public class Interviews {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timesPerWeek = scanner.nextInt();
        int liquidCap = scanner.nextInt();

        if (timesPerWeek < 0 || liquidCap <= 0) {
            System.out.println("Введены некорректные данные");
            return;
        }

        int liquidSpentPerWeak = liquidCap * timesPerWeek;
        int liquidFullSpent = 0;

        for (int i = 1; i <= 16; i++) {
            liquidFullSpent += liquidSpentPerWeak;
            System.out.printf("К %d неделе будет выпито %d литров жидкости \n", i, liquidFullSpent);
        }

        if (liquidFullSpent >= 120)
            System.out.println("Студент принят в IT-клуб");
        else
            System.out.println("К сожалению, студент не принят в клуб");
    }
}
