package 자료구조5주차;

class TreeNode{
	Object data;
	TreeNode left;
	TreeNode right;
}
class LinkTree{
	private TreeNode root;
	
	public TreeNode makeBT(TreeNode bt1, Object data, TreeNode bt2) {
		TreeNode root = new TreeNode();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		return root;
	}
	
	public void preorder(TreeNode root) {
		if(root != null) {
			System.out.printf("%c", root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
}
public class TreeEx_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedTree T = new LinkedTree();
		TreeNode n7 = T.makeBT(null, 'D', null);
		TreeNode n6 = T.makeBT(null, 'C', null);
		TreeNode n5 = T.makeBT(null, 'B', null);
		TreeNode n4 = T.makeBT(null, 'A', null);
		TreeNode n3 = T.makeBT(n6, '/', n7);
		TreeNode n2 = T.makeBT(n4, '*', n5);
		TreeNode n1 = T.makeBT(n2, '-', n3);
		System.out.printf("\n Preorder: ");
		T.preorder(n1);
		System.out.printf("\n Inorder: ");
		T.inorder(n1);
		System.out.printf("\n Postorder: ");
		T.postorder(n1);
	}

}
