package com.company;

import java.util.ArrayList;
import java.util.List;

//Given the root of a binary tree, return the level order traversal of its nodes' values.
// (i.e., from left to right, level by level).
public class BinaryTreeLevelOrderTraversal {
    private final List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode left, TreeNode right, int level ) {
        if (left == null && right == null) return result;
        if (result.size() <= level ){
        ArrayList<Integer> newList = new ArrayList<>();
        result.add(newList);
        }
        ArrayList<Integer> newList = (ArrayList<Integer>) result.get(level);
        if (left != null) {
            newList.add(left.val);
            levelOrder(left.left, left.right, level + 1);
        }
        if (right!= null) {
            newList.add(right.val);
            levelOrder(right.left, right.right, level + 1);
        }

        return result;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return result;
        ArrayList<Integer> newList = new ArrayList<>();
        result.add(newList);
        newList.add(root.val);
        levelOrder(root.left, root.right, 1);
        return result;
    }
}
