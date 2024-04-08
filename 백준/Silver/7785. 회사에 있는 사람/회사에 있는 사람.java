import java.util.*;

public class Main{
    public static List<String> getCurrentEmployees(List<String> logs) {
        Map<String, Boolean> employees = new HashMap<>(); // 사람의 출입 여부를 저장하는 맵

        for (String log : logs) {
            String[] parts = log.split(" "); // 로그에서 이름과 출입 행동을 추출
            String name = parts[0];
            String action = parts[1];

            if (action.equals("enter")) {
                employees.put(name, true); // 출근한 경우 맵에 이름과 true로 설정
            } else if (action.equals("leave")) {
                employees.put(name, false); // 퇴근한 경우 맵에 이름과 false로 설정
            }
        }

        List<String> currentEmployees = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : employees.entrySet()) {
            if (entry.getValue()) { // 현재 회사에 있는 사람들을 찾음
                currentEmployees.add(entry.getKey());
            }
        }

        Collections.sort(currentEmployees, Collections.reverseOrder()); // 사전 순으로 역순으로 정렬
        return currentEmployees;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 로그 수
        scanner.nextLine(); // 개행 문자 처리

        List<String> logs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            logs.add(scanner.nextLine()); // 출입 로그 추가
        }

        List<String> result = getCurrentEmployees(logs);

        for (String employee : result) {
            System.out.println(employee);
        }
    }
}
