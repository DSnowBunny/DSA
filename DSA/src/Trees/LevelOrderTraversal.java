package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public ArrayList<ArrayList<Integer>> levelTraversal(TreeNode A){
		Queue<TreeNode> q = new LinkedList<>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		q.add(A);
		
		while(!q.isEmpty()) {
		ArrayList<Integer> al = new ArrayList();
		int sz = q.size();
		for(int i =1; i<=sz; i++) {
			
			TreeNode root = q.remove();
			 al.add(root.val);
			 if(root.left != null) {
				 q.add(root.left);
			 }
			 if(root.right!= null) {
				 q.add(root.right); 
			 }
			 
		}
		res.add(al);
		
		}
		
		
		return res;
	}
	// return arraylist of arraylist in levels
	public static void main(String[] args) {
		int[] arr = {3, 9, 20, 15, 7};
		ArrayList<ArrayList<Integer>> res = new ArrayList();
        TreeNode root = TreeNode.createTree(arr);
        LevelOrderTraversal iot = new LevelOrderTraversal();
        res = iot.levelTraversal(root);
        Arrays.asList(res).stream().forEach(System.out::println);
	}
	
	

}
