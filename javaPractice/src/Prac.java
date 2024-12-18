import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        // Initialize the matrix correctly
        List<List<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(List.of(1, 0, 0, 0)));
        mat.add(new ArrayList<>(List.of(1, 1, 0, 1)));
        mat.add(new ArrayList<>(List.of(1, 1, 0, 0)));
        mat.add(new ArrayList<>(List.of(0, 1, 1, 1)));

        // Call findPath to find possible paths
        List<String> ans = findPath(mat);

        // Print each path
        for (String path : ans) {
            System.out.println(path);
        }
    }

    private static List<String> findPath(List<List<Integer>> mat) {
        List<String> ans = new ArrayList<>();
        String path = "";
        helper(mat, 0, 0, path, ans);
        return ans;
    }

    // Mark helper method as static
    private static void helper(List<List<Integer>> mat, int row, int col, String path, List<String> ans) {
        int n = mat.size();

        // Check bounds and obstacles
        if (row < 0 || col < 0 || row >= n || col >= n || mat.get(row).get(col) == 0 || mat.get(row).get(col) == -1) {
            return;
        }

        // If destination is reached, add the path to the result
        if (row == n - 1 && col == n - 1) {
            ans.add(path);
            return;
        }

        // Mark the cell as visited
        mat.get(row).set(col, -1);

        // Recur for all possible moves
        helper(mat, row + 1, col, path + "D", ans);  // Down
        helper(mat, row - 1, col, path + "U", ans);  // Up
        helper(mat, row, col - 1, path + "L", ans);  // Left
        helper(mat, row, col + 1, path + "R", ans);  // Right

        // Unmark the cell as visited
        mat.get(row).set(col, 1);
    }
}
