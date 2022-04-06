package GenericTree;

import java.util.*;

public class CeilAndFloor {

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
	
	static int floor = Integer.MIN_VALUE;
	static int ceil = Integer.MAX_VALUE;
	
	public static void floorAndCeil(TreeNode node, int data)
	{
		if(node.data > data)
			ceil = Math.min(node.data, ceil);
		
		if(node.data < data)
			floor = Math.max(node.data,  floor);
		
		for(TreeNode child : node.children)
			floorAndCeil(child, data);
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
		
		floorAndCeil(root, data);
		
		System.out.println("Floor : " + floor + " Ceil : " + ceil);
		
	}

}
