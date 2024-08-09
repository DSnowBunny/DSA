package Trees;

import java.util.ArrayList;

// pre - order Node,left, right
public class PreorderTraversal {
	ArrayList<Integer> res = new ArrayList();
	public ArrayList<Integer> preorder(TreeNode A) {
		if(A == null) {
			return null;
		}
		res.add(A.val);
		preorder(A.left);
		preorder(A.right);
		
		return res;
		
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		ArrayList<Integer> res = new ArrayList();
        TreeNode root = TreeNode.createTree(arr);
        PreorderTraversal iot = new PreorderTraversal();
        res = iot.preorder(root);
        for(int a : res) {
        	System.out.print(a);
        }
        
        
	}
	

}
