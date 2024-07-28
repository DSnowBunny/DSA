package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBT {
	
	public ArrayList<Integer> rightView(TreeNode A){
		ArrayList<Integer> res = new ArrayList();
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(A);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=1;i<=size; i++) {
				TreeNode temp = q.remove();
				if(i==1) {
					res.add(temp.val);
				}		
			
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5,6,7,8};
		ArrayList<Integer> res = new ArrayList();
        TreeNode root = TreeNode.createTree(arr);
        LeftViewOfBT iot = new LeftViewOfBT();
        res = iot.rightView(root);
        res.stream().forEach(System.out::println);
	}

}
