Leetcode all test cases passed.
Time Complexity: O(n)
Space Complexity: O(n)

class Solution {
    public int sumNumbers(TreeNode root) {
        //Stack<TreeNode> stack = new Stack<>();
        return helper(root,0);
    }
    public int helper(TreeNode root, int val)
    {
        //Here, we pass the value so far(root.val*10) to the next node
        if(root==null) return 0;
        if((root.left==null)&&(root.right==null)) return val*10+root.val;
       return helper(root.left,val*10+root.val) + helper(root.right,val*10+root.val);
    }      
}
