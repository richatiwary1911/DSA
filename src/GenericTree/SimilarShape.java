package GenericTree;

import java.util.*;

public class SimilarShape {

	public static class TreeNode
	{
		int data;
		ArrayList<TreeNode> children = new ArrayList<>();
	}
	
	public static TreeNode construct(int a[])
	{
		Stack<TreeNode> st = new Stack<>();
		TreeNode root = null;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == -1)
				st.pop();
			
			else
			{
				TreeNode child = new TreeNode();
				child.data = a[i];
				
				if(!st.isEmpty())
				{
					st.peek().children.add(child);
				}
				else
					root = child;
				
				st.push(child);
			}
		}
		return root;
	}
	
	public static boolean isSimilar(TreeNode node1, TreeNode node2)
	{
		if(node1.children.size() != node2.children.size())
			return false;
		
		for(int i = 0; i < node1.children.size(); i++)
		{
			if(!isSimilar(node1.children.get(i), node2.children.get(i)))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a[] = new int[n1];
		
		for(int i = 0; i < n1; i++)
			a[i] = sc.nextInt();
		
		TreeNode root1 = construct(a);
		
		int n2 = sc.nextInt();
		int b[] = new int[n2];
		
		for(int j = 0; j < n2; j++)
			b[j] = sc.nextInt();
		
		
		TreeNode root2 = construct(b);
		
		System.out.println(isSimilar(root1, root2));
	}

}
