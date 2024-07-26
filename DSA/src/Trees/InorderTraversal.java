package Trees;

import java.util.ArrayList;

//Given a binary tree, return the inorder traversal of its nodes' values.
// inorder traversal - left, root, right
public class InorderTraversal {

	ArrayList<Integer> inorder = new ArrayList();
	 ArrayList<Integer> inorderTraveresal (TreeNode A) {
		
		
		if(A == null) {
			return null;
		}
		
		inorderTraveresal(A.left);
		inorder.add(A.val);
		inorderTraveresal(A.right);
		return inorder;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		ArrayList<Integer> res = new ArrayList();
        TreeNode root = TreeNode.createTree(arr);
        InorderTraversal iot = new InorderTraversal();
        res = iot.inorderTraveresal(root);
        for(int a : res) {
        	System.out.print(a);
        }
        
        
	}

}
