package GenericTree;

import java.util.*;

import GenericTree.MaximumInGenericTree.TreeNode;

public class HeightOfGenericTree {

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
	
	public static int getHeight(TreeNode root)
	{		
		int height = -1;
		for(TreeNode child : root.children)
			height = Math.max(height, getHeight(child));
		
		height += 1;
		return height;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		TreeNode root = construct(a);
		
		System.out.println("Height of a Generic Tree: " + getHeight(root));
	}

}
