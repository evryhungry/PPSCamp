import java.util.Arrays;
// https://leetcode.com/problems/maximum-units-on-a-truck/
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int totalWeight = 0;

        for (int[] box : boxTypes) {
            int count = Math.min(truckSize, box[0]);
            totalWeight += count * box[1];
            truckSize -= count;

            if (truckSize == 0) break;
        }

        return totalWeight;
    }
}
