import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 집합 S에 속하는 문자열을 저장할 Set 자료구조를 생성합니다.
        Set<String> stringSet = new HashSet<>();

        // 문자열의 개수 N과 검사해야 하는 문자열의 개수 M을 입력받습니다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 집합 S에 포함되어 있는 문자열을 입력받고, Set에 저장합니다.
        for (int i = 0; i < N; i++) {
            stringSet.add(br.readLine());
        }

        // 집합 S에 포함되어 있는 문자열 중에서 입력으로 주어진 문자열들이 몇 개나 포함되는지를 카운트합니다.
        int count = 0;
        for (int i = 0; i < M; i++) {
            String testString = br.readLine();
            if (stringSet.contains(testString)) {
                count++;
            }
        }

        // 결과를 출력합니다.
        System.out.println(count);
    }
}
