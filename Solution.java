class Solution {
    public int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int temp = Math.abs(n);
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        if (n < 0) {
            count++;
        }
        return count;
    }
    
    public int[] findColumnWidth(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] ans = new int[m];
        Arrays.fill(ans, 0);
        for (int i = 0; i < m; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, countDigits(grid[j][i]));
            }
            ans[i] = max;
        }
        return ans;
    }
}
