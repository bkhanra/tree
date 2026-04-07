package trees;

public class TreeUseCase {
	
	public static void printTree(TreeNode<Integer> root) {
		System.out.print(root.data + " ");
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode<Integer> root = new TreeNode<>(4);
		
		TreeNode<Integer> child1 = new TreeNode<>(2);
		TreeNode<Integer> child2 = new TreeNode<>(3);
		TreeNode<Integer> child3 = new TreeNode<>(1);
		TreeNode<Integer> child4 = new TreeNode<>(5);
		TreeNode<Integer> child5 = new TreeNode<>(6);
		root.children.add(child1);
		root.children.add(child2);
		root.children.add(child3);
		child2.children.add(child4);
		child2.children.add(child5);
		
		printTree(root);
		
	
		
		

	}

}
