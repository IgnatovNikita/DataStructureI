package com.company;

import java.util.ArrayList;
import java.util.List;

/*Given an integer numRows, return the first numRows of Pascal's triangle.

        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>(1);
        zero.add(1);
        res.add(zero);
        for (int i = 1; i < numRows; i++){
            ArrayList<Integer> next = new ArrayList<>(i+1);
            next.add(1);
            for (int j = 1; j < res.get(i-1).size(); j++){
                next.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            next.add(1);
            res.add(next);
        }

        return res;
    }
}
