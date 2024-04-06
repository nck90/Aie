import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // 좌표의 개수 입력
        int[] X = new int[N]; // 좌표를 저장할 배열
        
        // 좌표들을 배열에 저장
        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextInt();
        }
        
        // 중복을 제거하고 정렬한 새로운 리스트를 만듦
        Set<Integer> sortedXSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            sortedXSet.add(X[i]);
        }
        
        List<Integer> sortedXList = new ArrayList<>(sortedXSet);
        
        // 각 좌표의 압축된 값을 저장할 맵 생성
        Map<Integer, Integer> compressedXMap = new HashMap<>();
        for (int i = 0; i < sortedXList.size(); i++) {
            compressedXMap.put(sortedXList.get(i), i);
        }
        
        // 좌표를 순회하면서 압축된 값을 출력
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            result.append(compressedXMap.get(X[i])).append(" ");
        }
        
        System.out.println(result.toString());
    }
}
