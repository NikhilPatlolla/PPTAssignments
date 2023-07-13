
/*
*
To check if the given inorder, preorder, and postorder traversals belong to the same tree, we can use the following approach:

Define a TreeNode class to represent a node in the binary tree. Each node will have a val representing its value and left and right pointers to its left and right children, respectively.
Create a function isSameTree that takes the inorder, preorder, and postorder arrays as input and returns a boolean indicating whether they belong to the same tree.
Check if the lengths of the three input arrays are the same. If not, return false since they cannot represent the same tree.
If the lengths are zero, return true since an empty tree is the same regardless of the traversals.
Create a recursive helper function constructTree that takes the following parameters:
inorder: The inorder traversal array.
preorder: The preorder traversal array.
postorder: The postorder traversal array.
inStart and inEnd: The starting and ending indices of the current inorder subarray.
preStart and preEnd: The starting and ending indices of the current preorder subarray.
postStart and postEnd: The starting and ending indices of the current postorder subarray.
In the constructTree function, check if the subarrays are valid (i.e., the starting indices are less than or equal to the ending indices). If not, return null to indicate an empty subtree.
Create a new TreeNode with the value at preStart as the root.
Find the index of the root value in the inorder array (inIndex). This index divides the inorder array into left and right subtrees.
Calculate the sizes of the left and right subtrees: leftSize = inIndex - inStart and rightSize = inEnd - inIndex.
Recursively call constructTree to build the left subtree with the following parameters:
inorder, preorder, and postorder arrays.
inStart and inIndex - 1 as the new range for the left subtree in the inorder array.
preStart + 1 and preStart + leftSize as the new range for the left subtree in the preorder array.
postStart and postStart + leftSize - 1 as the new range for the left subtree in the postorder array.
Recursively call constructTree to build the right subtree with the following parameters:
inorder, preorder, and postorder arrays.
inIndex + 1 and inEnd as the new range for the right subtree in the inorder array.
preEnd - rightSize + 1 and preEnd as the new range for the right subtree in the preorder array.
postEnd - rightSize and postEnd - 1 as the new range for the right subtree in the postorder array.
Set the left and right children of the root node using the results of the recursive calls.
Return the root node.
In the isSameTree function, call constructTree with appropriate initial parameters.
If the returned root from constructTree is null, return false since the traversals do not represent the same tree.
Otherwise, return true to indicate that the traversals belong to the same tree.
*
* */

public class CheckTraversalsOfSameTree {
    public boolean isSameTree(int[] inorder, int[] preorder, int[] postorder) {
        if (inorder.length != preorder.length || inorder.length != postorder.length) {
            return false;
        }

        if (inorder.length == 0) {
            return true;
        }

        TreeNode root = constructTree(inorder, preorder, postorder, 0, inorder.length - 1, 0, preorder.length - 1, 0,
                postorder.length - 1);

        return root != null;
    }

    private TreeNode constructTree(int[] inorder, int[] preorder, int[] postorder, int inStart, int inEnd, int preStart,
                                   int preEnd, int postStart, int postEnd) {
        if (inStart > inEnd || preStart > preEnd || postStart > postEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int inIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
                break;
            }
        }

        int leftSize = inIndex - inStart;
        int rightSize = inEnd - inIndex;

        root.left = constructTree(inorder, preorder, postorder, inStart, inIndex - 1, preStart + 1,
                preStart + leftSize, postStart, postStart + leftSize - 1);
        root.right = constructTree(inorder, preorder, postorder, inIndex + 1, inEnd, preEnd - rightSize + 1, preEnd,
                postEnd - rightSize, postEnd - 1);

        return root;
    }
}
