class Solution {
    public int largestCombination(int[] candidates) {
        int res = 0;

        for (int i = 0; i < 24; i++) {
            int c = 0;
            for (int j = 0; j < candidates.length; j++) {
                if (((1 << i) & candidates[j]) != 0) {
                    c++;
                }
            }
            res = Math.max(res, c);
        }

        return res;
    }
}