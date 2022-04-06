package GenericTree;

import java.util.*;

public class LevelOrderZigZag {

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
	
	public static void levelOrderZigzag(TreeNode node)
	{
		Stack<TreeNode> ms = new Stack<>();
		Stack<TreeNode> cs = new Stack<>();
		
		int level = 1;
		ms.push(node);
		
		while(!ms.isEmpty())
		{			
			TreeNode out = ms.pop();
			System.out.print(out.data + " ");
			
			if(level % 2 == 0)
			{
				for(int i = out.children.size() - 1; i >= 0; i--)
					cs.push(out.children.get(i));
			}
			else
			{
				for(int i = 0; i < out.children.size(); i++)
					cs.push(out.children.get(i));
			}
			
			if(ms.isEmpty())
			{
				ms = cs;
				cs = new Stack<>();
				System.out.println();
				level ++;
			}
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
		
		levelOrderZigzag(root);

		
	}

}
