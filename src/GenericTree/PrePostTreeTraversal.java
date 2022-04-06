package GenericTree;

import java.util.*;

import GenericTree.HeightOfGenericTree.TreeNode;

public class PrePostTreeTraversal {

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
	
	public static void preAndPostTraversal(TreeNode node)
	{
		System.out.println("Node Pre -> " + node.data);
		
		for(TreeNode child : node.children)
		{
			System.out.println("Edge Pre " + node.data + "---" + child.data);
			preAndPostTraversal(child);
			System.out.println("Edge Post " + node.data + "---" + child.data);
		}
		
		System.out.println("Node Post " + node.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		TreeNode root = construct(a);
		
		preAndPostTraversal(root);
	}

}
