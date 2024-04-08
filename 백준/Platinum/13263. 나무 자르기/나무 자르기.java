import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Line {
        long a, b;
        double s;

        Line(long a_, long b_, double s_) {
            a = a_;
            b = b_;
            s = s_;
        }
    }

    static double cross(Line f, Line g) {
        return (g.b - f.b) / (f.a - g.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; ++i)
            a[i] = scanner.nextInt();

        for (int i = 0; i < n; ++i)
            b[i] = scanner.nextInt();

        List<Line> s = new ArrayList<>();
        long[] dp = new long[n];

        for (int i = 1; i < n; ++i) {
            Line g = new Line(b[i - 1], dp[i - 1], 0);

            while (!s.isEmpty()) {
                g.s = cross(g, s.get(s.size() - 1));
                if (g.s < s.get(s.size() - 1).s)
                    s.remove(s.size() - 1);
                else
                    break;
            }
            s.add(g);

            long x = a[i];
            int fpos = 0;

            int left = 0, right = s.size() - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (s.get(mid).s < x) {
                    fpos = mid;
                    left = mid + 1;
                } else
                    right = mid - 1;
            }

            dp[i] = s.get(fpos).a * x + s.get(fpos).b;
        }
        System.out.println(dp[n - 1]);
    }
}
