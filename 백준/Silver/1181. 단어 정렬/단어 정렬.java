import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> words = new ArrayList<>();

        // 단어를 ArrayList에 저장
        for (int i = 0; i < N; i++) {
            words.add(br.readLine());
        }

        // Comparator를 이용하여 정렬
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return Integer.compare(s1.length(), s2.length());
            }
        });

        // 중복 제거를 위해 HashSet을 이용하여 정렬된 단어들을 저장
        HashSet<String> uniqueWords = new HashSet<>(words);

        // 정렬된 단어들을 출력
        for (String word : words) {
            if (uniqueWords.contains(word)) {
                System.out.println(word);
                uniqueWords.remove(word); // 중복 제거
            }
        }
    }
}
