import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Member {
    int age;
    String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Member> members = new ArrayList<>();

        // 회원 정보 입력
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members.add(new Member(age, name));
        }

        // Comparator를 이용하여 회원을 정렬
        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if (m1.age == m2.age) {
                    return 0; // 나이가 같으면 순서 유지
                }
                return Integer.compare(m1.age, m2.age); // 나이 오름차순 정렬
            }
        });

        // 정렬된 회원 정보 출력
        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }
}
