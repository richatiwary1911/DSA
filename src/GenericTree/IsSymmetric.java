package GenericTree;

import java.util.*;

public class IsSymmetric {

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
	
	
	public static boolean isMirror(TreeNode node1, TreeNode node2)
	{
		if(node1.children.size() != node2.children.size())
			return false;
		
		int i = 0;
		int j = node1.children.size() - 1;
		
		while(i < node1.children.size() && j >= 0)
		{
			if(!isMirror(node1.children.get(i), node2.children.get(j)))
				return false;
			
			i++;
			j--;
		}
		return true;
	}
	
	public static boolean isSymmetric(TreeNode node)
	{
		return isMirror(node, node);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		TreeNode root1 = construct(a);
		
		System.out.println(isSymmetric(root1));
		
	}

}
