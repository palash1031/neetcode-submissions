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
    public TreeNode invertTree(TreeNode root) {
        inverter(root);
        return root;
    }

    private void inverter(TreeNode curr) {
        if (curr == null) {
            return;
        }

        TreeNode lC = curr.left;
        TreeNode rC = curr.right;

        curr.left = rC;
        curr.right = lC;

        inverter(curr.left);
        inverter(curr.right);
    }
}
