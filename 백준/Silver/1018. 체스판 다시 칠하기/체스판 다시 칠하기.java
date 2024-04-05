import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        scanner.close();

        int minChanges = countMinChanges(board);
        System.out.println(minChanges);
    }

    // 최소 변경 횟수 계산
    public static int countMinChanges(char[][] board) {
        int minChanges = Integer.MAX_VALUE;

        // 8x8 크기의 체스판으로 만들 수 있는 모든 경우를 탐색
        for (int i = 0; i <= board.length - 8; i++) {
            for (int j = 0; j <= board[0].length - 8; j++) {
                int changes1 = countChanges(board, i, j, 'W'); // 맨 왼쪽 위 칸이 흰색인 경우
                int changes2 = countChanges(board, i, j, 'B'); // 맨 왼쪽 위 칸이 검은색인 경우
                minChanges = Math.min(minChanges, Math.min(changes1, changes2));
            }
        }

        return minChanges;
    }

    // 해당 위치에서 8x8 체스판으로 만들었을 때 변경해야 하는 정사각형 개수 계산
    public static int countChanges(char[][] board, int startX, int startY, char startColor) {
        int changes = 0;
        char currentColor = startColor;

        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                if (board[i][j] != currentColor) {
                    changes++;
                }
                // 다음 칸의 색상을 결정하기 위해 현재 칸의 색상과 반대되는 색상으로 변경
                currentColor = (currentColor == 'W') ? 'B' : 'W';
            }
            // 행이 바뀔 때는 시작 색상을 변경해야 함
            currentColor = (currentColor == 'W') ? 'B' : 'W';
        }

        return changes;
    }
}
