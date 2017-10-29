package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Tree {
	
	 Node root;

	
	public class Node{
		Node left;
		Node right;
		int val;
		
		public Node(int data){
			this.val = data;
		}
	
	}
		
	public void insert(int data){
		insert(root,data);
	}
	private void insert(Node node,int data){
		if(node == null){
			root = new Node(data);
		}
		else if(node.val > data){
			if(node.left == null){
				node.left = new Node(data);
			}
			else {
				insert(node.left,data);
			}
		}
		else if(data > node.val){
			if(node.right == null){
				node.right = new Node(data);
			}
			else {
				insert(node.right,data);
			}			
		}
	}
	public void inOrderTraversal(Node node){
		if(node.left != null){
			inOrderTraversal(node.left);
		}
		System.out.println(node.val);
		
		if(node.right != null){
			inOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal(Node node){
		if(node.left != null){
			postOrderTraversal(node.left);
		}
		if(node.right != null){
			postOrderTraversal(node.right);
		}
		System.out.println(node.val);
	}
	
	public void preOrderTraversal(Node node){
		System.out.println(node.val);
		
		if(node.left != null){
			preOrderTraversal(node.left);
		}
		if(node.right != null){
			preOrderTraversal(node.right);
		}
	}
	
	
	public void bfs(){
		Queue<Node> q  = new LinkedList<Node>();
		q.add(this.root);
		
		while(q.isEmpty() == false){
			Node node = q.peek();
			if(node.left != null){
				q.add(node.left);
			}
			if(node.right != null){
				q.add(node.right);
			}
			System.out.println(node.val);
			q.poll();
			
		}
		
		
	}
	
	public void bfs1(){
		Queue<Node> q  = new LinkedList<Node>();
		// Map<Integer,ArrayList<Integer>> hmap = new HashMap<>();
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		q.add(this.root);
		q.add(null);
		
		int key=0;
		
		while(q.isEmpty() == false)
		{
			Node node = q.peek();
			
			if(node != null){
				values.add(node.val);
				if(node.left != null){
					q.add(node.left);
				}
				if(node.right != null){
					q.add(node.right);
				}
				System.out.println(node.val);
				//q.poll();
			}
			else
			{
				System.out.println("null");
				q.poll();
				if(!q.isEmpty())
				q.add(null);
				
			}
			
//			hmap.put(key, values.add(node.val));
//			q.poll();
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(30);
		tree.insert(80);
		tree.insert(90);
		tree.insert(20);
		tree.insert(10);
		tree.insert(25);
		tree.insert(75);
		System.out.println("**************InOrder**************");
		tree.inOrderTraversal(tree.root);
		System.out.println("**************PostOrder**************");
		tree.postOrderTraversal(tree.root);
		System.out.println("**************PreOrder**************");
		tree.preOrderTraversal(tree.root);
		System.out.println("**************BFS**************");
		tree.bfs();
		System.out.println("**************Sum of 1 level in BFS**************");
		tree.bfs1();
	}
	


}


