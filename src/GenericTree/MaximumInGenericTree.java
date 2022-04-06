package GenericTree;
import java.util.*;

public class MaximumInGenericTree {

	public static class TreeNode
	{
		int data;
		ArrayList<TreeNode> children = new ArrayList<>();
	}
	
	public static TreeNode construct(int a[])
	{
		TreeNode root = null;
		
		Stack<TreeNode> st = new Stack<>();
		
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
	
	public static int getMax(TreeNode root)
	{
		if(root == null)
			return 0;
		
		int max = Integer.MIN_VALUE;
		for(TreeNode child : root.children)
			max = Math.max(max,  getMax(child));
		
		if(max > root.data)
			return max;
		else
			return root.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		TreeNode root = construct(a);
		
		System.out.println("Maximum of a Generic Tree: " + getMax(root));
		
	}

}
