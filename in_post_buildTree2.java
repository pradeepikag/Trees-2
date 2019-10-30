class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int index=-1;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[0]){
                index=i;
            }
        }
        int[] preLeft = Arrays.copyOfRange(preorder,1,index+1);
        int[] preRight = Arrays.copyOfRange(preorder,index+1,preorder.length);
        int[] inLeft = Arrays.copyOfRange(inorder,0,index);
        int[] inRight = Arrays.copyOfRange(inorder,index+1,inorder.length);
        //Building Left Sub Tree
        root.left = buildTree(preLeft,inLeft);
        //Building Right Sub Tree
        root.right = buildTree(preRight,inRight);
        return root;
    }
}
