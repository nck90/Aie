import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int count = 0;

        while (N % 5 != 0 && N >= 0) {
            N -= 3;
            count++;
        }

        if (N < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count + N / 5);
        }
    }
}
