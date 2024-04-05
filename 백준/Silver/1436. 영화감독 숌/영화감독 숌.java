import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int count = 0;
        int num = 666;

        while (true) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            if (count == N) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
