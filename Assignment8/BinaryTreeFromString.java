class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeFromString {
    public TreeNode str2tree(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        int firstParenthesis = s.indexOf("(");

        // If no parenthesis found, the whole string is a single node
        if (firstParenthesis == -1) {
            return new TreeNode(Integer.parseInt(s));
        }

        // Get the root value from the substring before the first parenthesis
        int rootValue = Integer.parseInt(s.substring(0, firstParenthesis));
        TreeNode root = new TreeNode(rootValue);

        int openParenthesis = 1;
        int i = firstParenthesis + 1;

        // Find the substring of the left child
        while (i < s.length() && openParenthesis != 0) {
            if (s.charAt(i) == '(') {
                openParenthesis++;
            } else if (s.charAt(i) == ')') {
                openParenthesis--;
            }
            i++;
        }

        // Recursively construct the left child from the substring
        root.left = str2tree(s.substring(firstParenthesis + 1, i - 1));

        // If there are more characters after the first parenthesis, construct the right child
        if (i < s.length()) {
            root.right = str2tree(s.substring(i + 1, s.length() - 1));
        }

        return root;
    }
}
