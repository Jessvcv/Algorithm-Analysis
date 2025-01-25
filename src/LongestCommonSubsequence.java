public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(char[] str1, char[] str2) {
        //length of strings used in loops
        int m = str1.length;
        int n = str2.length;

        // Create a 2D array to store lengths of longest common subsequences
        int[][] dp = new int[m + 1][n + 1];

        // Fill the dp array using nested loops
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Makes sure that the characters at the current positions in both strings are the same
                if (str1[i - 1] == str2[j - 1]) {
                    // Extend by 1 and store the result in the next cell
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // If characters do not match, use maximum value from before
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The bottom-right cell has the length of the longest common subsequence
        return dp[m][n];
    }

    public static void main(String[] args) {
        char[] text0 = "abc".toCharArray();
        char[] text1 = "abc".toCharArray();

        char[] text2 = "almanacs".toCharArray();
        char[] text3 = "albatross".toCharArray();

        char[] text4 = "almanac".toCharArray();
        char[] text5 = "ferris".toCharArray();

        int result0 = longestCommonSubsequence(text0, text1);
        int result1 = longestCommonSubsequence(text2, text3);
        int result2 = longestCommonSubsequence(text4, text5);

        System.out.println("The length of the longest common subsequence is: " + result0);
        System.out.println("The length of the longest common subsequence is: " + result1);
        System.out.println("The length of the longest common subsequence is: " + result2);
    }
}
