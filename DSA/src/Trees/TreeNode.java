package Trees;

import java.util.LinkedList;
import java.util.Queue;

// basic trees class to be used in all the questions
public class TreeNode {
    int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
        
        // Method to create a binary tree from an array
        public static TreeNode createTree(int[] arr) {
            if (arr == null || arr.length == 0) {
                return null;
            }

            TreeNode root = new TreeNode(arr[0]);
            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);
            
            int i = 1;
            while (i < arr.length) {
                TreeNode current = queue.poll();

                if (i < arr.length) {
                    current.left = new TreeNode(arr[i]);
                    queue.add(current.left);
                    i++;
                }
                
                if (i < arr.length) {
                    current.right = new TreeNode(arr[i]);
                    queue.add(current.right);
                    i++;
                }
            }
            
            return root;
        }
}
