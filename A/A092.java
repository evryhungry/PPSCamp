class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIdx = 0;
        int oddIdx = 1;
        int n = nums.length;

        while (evenIdx < n && oddIdx < n) {
            if (nums[evenIdx] % 2 == 1) {
                while (nums[oddIdx] % 2 == 1) {
                    oddIdx += 2;
                }
                int temp = nums[evenIdx];
                nums[evenIdx] = nums[oddIdx];
                nums[oddIdx] = temp;
            }
            evenIdx += 2;
        }

        return nums;
    }
}
