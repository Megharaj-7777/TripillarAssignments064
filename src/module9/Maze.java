package module9;
public class Maze {
    static int countPaths(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) return 1;
        if (i >= n || j >= m) return 0;

        return countPaths(i + 1, j, n, m) + countPaths(i, j + 1, n, m);
    }

    public static void main(String[] args) {
        System.out.println(countPaths(0, 0, 3, 3));
    }
}
