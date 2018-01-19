/*606. Construct String from Binary Tree
You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that dont affect the one-to-one mapping relationship between the string and the original binary tree.
Example1:
Input: Binary tree: [1,2,3,4]
	       1
	     /   \
	    2     3
	   /    
	  4     

	Output: "1(2(4))(3)"

	Explanation: Originally it needs to be "1(2(4)())(3()())", 
	but you need to omit all the unnecessary empty parenthesis pairs. 
	And it will be "1(2(4))(3)".
	
Example 2:
		Input: Binary tree: [1,2,3,null,4]
			       1
			     /   \
			    2     3
			     \  
			      4 

			Output: "1(2()(4))(3)"

			Explanation: Almost the same as the first example, 
			except we can't omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.

*/
package string;

public class StrFrmBinTree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	

	public String tree2str(TreeNode t) {
        
        StringBuilder sb = new StringBuilder();
        
        if(t == null){
        	return "";
        }
        
        sb.append(t.val);
        if(t.left != null){
        	sb.append("(" + tree2str(t.left) + ")");
        }else if(t.right != null){
        	sb.append("()");
        }
        
        if(t.right != null){
        	sb.append("(" + tree2str(t.right) + ")");
        }
        return sb.toString();
	}

	public static void main(String[] args) {
		

	}

}
