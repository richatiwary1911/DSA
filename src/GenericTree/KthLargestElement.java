package GenericTree;

import java.util.*;

import GenericTree.CeilAndFloor.TreeNode;

public class KthLargestElement {

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
	public static void floorValue(TreeNode node, int data)
	{
		if(node.data < data)
			floor = Math.max(floor, node.data);
		
		for(TreeNode child : node.children)
			floorValue(child, data);
	}
	
	public static int kthLargest(TreeNode node, int k)
	{
		int initialValue = Integer.MAX_VALUE;
		
		for(int i = 0; i < k; i++)
		{
			floorValue(node, initialValue);
			initialValue = floor;
			floor = Integer.MIN_VALUE;
		}
		
		return initialValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		TreeNode root = construct(a);
		
		int k = sc.nextInt();
		
		System.out.println("Kth Largest element : " + kthLargest(root, k));
	}

}
