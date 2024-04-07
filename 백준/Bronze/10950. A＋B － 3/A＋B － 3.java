import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 개수 T를 입력 받음
        int T = scanner.nextInt();

        // T번의 반복문을 통해 각 테스트 케이스에 대해 처리
        for (int i = 0; i < T; i++) {
            // A와 B를 입력 받음
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // A와 B의 합을 출력
            System.out.println(A + B);
        }

        scanner.close();
    }
}
