import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 응시자 수
        int k = scanner.nextInt(); // 상을 받는 사람 수

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }

        // 점수 배열을 내림차순으로 정렬
        Arrays.sort(scores);
        int cutlineScore = scores[N - k]; // 상을 받는 사람 중 가장 낮은 점수

        System.out.println(cutlineScore);

        scanner.close();
    }
}
