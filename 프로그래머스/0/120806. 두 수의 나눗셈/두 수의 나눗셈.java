public class Solution {
    public static int solution(int num1, int num2) {
        double result = (double) num1 / num2 * 1000;
        return (int) result;
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        System.out.println(solution(num1, num2)); // 출력: 1500

        num1 = 7;
        num2 = 3;
        System.out.println(solution(num1, num2)); // 출력: 2333

        num1 = 1;
        num2 = 16;
        System.out.println(solution(num1, num2)); // 출력: 62
    }
}
