package GenericTree;

import java.util.*;

public class LinearizeGenericTree {

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
	
	public static TreeNode getTail(TreeNode node)
	{
		while(node.children.size() != 0)
			node = node.children.get(0);
		
		return node;
	}
	
	public static void linearize(TreeNode node)
	{
		for(TreeNode child : node.children)
			linearize(child);
		
		while(node.children.size() > 1)
		{
			TreeNode last = node.children.remove(node.children.size() - 1);
			TreeNode secondLast = node.children.get(node.children.size() - 1);
			getTail(secondLast).children.add(last);
		}	
	}

	public static void display(TreeNode node)
	{
		String str = node.data + " -> ";
	    for (TreeNode child : node.children) {
	      str += child.data + " ";
	    }
	    System.out.println(str);

	    for (TreeNode child : node.children) {
	      display(child);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		TreeNode root = construct(a);
		
		display(root);
		linearize(root);
		System.out.println("----------Linearize--------");
		display(root);
		
	}

}
