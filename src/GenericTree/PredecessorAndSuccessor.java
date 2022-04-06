package GenericTree;

import java.util.*;

public class PredecessorAndSuccessor {

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
	
	static TreeNode pre;
	static TreeNode succ;
	static int level;
	
	public static void predecessorAndSuccessor(TreeNode node, int data)
	{
		if(level == 0)
		{
			if(node.data == data)
				level++;
			
			else
				pre = node;
		}
		
		else if(level == 1)
		{
			succ = node;
			System.out.println("Predecessor " + pre.data + " Successor " + succ.data);
			level++;
		}
		
		for(TreeNode child : node.children)
			predecessorAndSuccessor(child, data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		TreeNode root = construct(a);
		
		int data = sc.nextInt();
		
		predecessorAndSuccessor(root, data);
		
	}

}
