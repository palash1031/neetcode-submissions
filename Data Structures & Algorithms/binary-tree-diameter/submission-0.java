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

class Solution {
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int dummy = height(root);
        return maxDiameter;
    }

    private int height(TreeNode curr) {
        
        if (curr == null) {
            return 0;
        }
        int left = height(curr.left);
        int right = height(curr.right);

        maxDiameter = Math.max(maxDiameter, left + right);
        return 1 + Math.max(left,right);
    }
}
