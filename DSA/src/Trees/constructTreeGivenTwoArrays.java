package Trees;

import java.util.HashMap;


public class constructTreeGivenTwoArrays {
   

    static HashMap<Integer, Integer> hm = new HashMap<>();

    static TreeNode buildTree(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            hm.put(a[i], i);
        }
        return constructTree(a, b, 0, a.length - 1, b.length - 1);
    }

    static TreeNode constructTree(int[] in, int[] post, int st_in, int en_in, int en_po) {
        if (st_in > en_in || en_po < 0) {
            return null;
        }

        int idx = post[en_po];
        TreeNode rootNode = new TreeNode(idx);

        int root_in = hm.get(rootNode.val);
        int count_right = en_in - root_in;

        rootNode.left = constructTree(in, post, st_in, root_in - 1, en_po - count_right - 1);
        rootNode.right = constructTree(in, post, root_in + 1, en_in, en_po - 1);

        return rootNode;
    }

    public static void main(String[] args) {
        System.out.println("something");
        int[] A = new int[]{2, 1, 3};
        int[] B = new int[]{2, 3, 1};
        TreeNode res = buildTree(A, B);
        System.out.println(res.val);
    }
}
