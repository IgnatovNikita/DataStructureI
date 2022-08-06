package com.company;

import java.util.LinkedList;
import java.util.List;

//Given the root of a binary tree, return the inorder traversal of its nodes' values.
public class BinaryTreeInorderTraversal {
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null){
            return res;
        }

        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);

        return res;

    }
}
