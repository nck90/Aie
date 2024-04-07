import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 숫자 카드의 개수 입력
        Set<Integer> cards = new HashSet<>();

        // 상근이가 가지고 있는 숫자 카드를 집합에 저장
        for (int i = 0; i < N; i++) {
            cards.add(scanner.nextInt());
        }

        int M = scanner.nextInt(); // 확인해야 할 숫자의 개수 입력
        StringBuilder result = new StringBuilder();

        // 숫자 카드 확인
        for (int i = 0; i < M; i++) {
            int num = scanner.nextInt();
            result.append(cards.contains(num) ? "1 " : "0 ");
        }

        System.out.println(result.toString().trim());
    }
}
