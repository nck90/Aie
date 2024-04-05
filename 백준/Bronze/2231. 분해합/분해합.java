import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int result = findSmallestConstructor(N);
        System.out.println(result);
    }

    // 분해합을 구하는 메소드
    public static int decomposition(int num) {
        int sum = num;
        while (num > 0) {
            sum += num % 10; // 각 자리수를 더함
            num /= 10;
        }
        return sum;
    }

    // 가장 작은 생성자를 찾는 메소드
    public static int findSmallestConstructor(int N) {
        for (int i = 1; i <= N; i++) {
            if (decomposition(i) == N) {
                return i;
            }
        }
        return 0; // 생성자가 없는 경우 0 반환
    }
}
