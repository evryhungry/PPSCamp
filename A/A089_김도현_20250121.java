/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildSubTree(nums, 0, nums.length - 1);
    }

    TreeNode buildSubTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int now = (start + end) / 2;
        TreeNode node = new TreeNode(nums[now]);
        node.left = buildSubTree(nums, start, now - 1);
        node.right = buildSubTree(nums, now + 1, end);

        return node;//노드 반환
    }
}