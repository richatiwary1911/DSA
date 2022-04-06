package GenericTree;

import java.util.*;

public class SizeOfGenericTree {

	public static class Node
	{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}
	
	public static Node construct(int a[])
	{
		Node root = null;
		
		Stack<Node> st = new Stack<>();
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == -1)
			{
				st.pop();
			}
			else
			{
				Node child = new Node();
				child.data = a[i];
				
				if(st.size() > 0)
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
	
	public static int getSize(Node root)
	{
		if(root == null)
			return 0;
		
		int ans = 1;
		for(Node child : root.children)
			ans += getSize(child);
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		Node root = construct(a);
		
		int size = getSize(root);
		
		System.out.println("Size of given Generic tree is " + size);
		
	}

}

//Input : 
//20
//10
//20
//50
//-1
//-1
//130
//60
//-1
//70
//90
//-1
//100
//-1
//-1
//-1
//40
//80
//-1
//-1
//-1


//Output: Size of given Generic tree is 10




