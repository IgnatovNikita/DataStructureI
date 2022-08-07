package com.company;

import java.util.LinkedList;
import java.util.List;

//Given the root of a binary tree, return the postorder traversal of its nodes' values.
public class BinaryTreePostorderTraversal {
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null){
            return res;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        res.add(root.val);
        return res;
    }
}
