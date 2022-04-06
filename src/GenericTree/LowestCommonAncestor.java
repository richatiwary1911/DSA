package GenericTree;

import java.util.*;

public class LowestCommonAncestor {

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
	
	public static ArrayList<Integer> nodeToRootPath(TreeNode node, int data)
	{
		if(node.data == data)
		{
			ArrayList<Integer> base = new ArrayList<>();
			base.add(node.data);
			return base;
		}
		
		for(TreeNode child : node.children)
		{
			ArrayList<Integer> childPath = nodeToRootPath(child, data);
			if(childPath.size() > 0)
			{
				childPath.add(node.data);
				return childPath;
			}
		}
		return new ArrayList<Integer>();
	}
	
	public static int lowestCommonAncestor(TreeNode node, int data1, int data2)
	{
		ArrayList<Integer> list1 = nodeToRootPath(node, data1);
		ArrayList<Integer> list2 = nodeToRootPath(node, data2);
		
		int i = list1.size() - 1;
		int j = list2.size() - 1;
		
		while(i >= 0 && j >= 0 && list1.get(i) == list2.get(j))
		{
			i--;
			j--;
		}
		
		return list1.get(i + 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		TreeNode root = construct(a);
		
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		
		System.out.println(lowestCommonAncestor(root, data1, data2));
		
	}

}
