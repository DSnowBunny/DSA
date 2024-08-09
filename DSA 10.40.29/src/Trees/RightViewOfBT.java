package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBT {
	
	ArrayList<Integer> rightView (TreeNode A){
		ArrayList<Integer> res = new ArrayList();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(A);
		while(!q.isEmpty()) {
			int s = q.size();
			for(int i =1; i<=s; i++) {
				TreeNode m = q.remove();
				if(i==s) {
					res.add(A.val);
				}
				if(A.right!=null) 
					q.add(A.right);
				if(A.left!=null)
					q.add(A.left);
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5,6,7,8};
		ArrayList<Integer> res = new ArrayList();
        TreeNode root = TreeNode.createTree(arr);
        RightViewOfBT iot = new RightViewOfBT();
        res = iot.rightView(root);
        res.stream().forEach(System.out::println);
	
	}

}
