import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String number = br.readLine();
        Integer[] digits = new Integer[number.length()];
        
        // 문자열을 정수형 배열로 변환
        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i) - '0';
        }
        
        // 내림차순으로 정렬
        Arrays.sort(digits, Collections.reverseOrder());
        
        // 정렬된 배열을 문자열로 변환
        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            result.append(digit);
        }
        
        System.out.println(result);
    }
}
