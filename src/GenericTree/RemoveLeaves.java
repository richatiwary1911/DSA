package GenericTree;

import java.util.*;

public class RemoveLeaves {

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
	
	public static void removeLeaves(TreeNode node)
	{
		for(int i = node.children.size() -1; i >= 0; i--)
		{
			TreeNode temp = node.children.get(i);
			
			if(temp.children.size() == 0)
				node.children.remove(temp);
		}
		for(TreeNode child : node.children)
			removeLeaves(child);
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
		removeLeaves(root);
		System.out.println("----------After Removing Leaves--------");
		display(root);
		
	}

}
