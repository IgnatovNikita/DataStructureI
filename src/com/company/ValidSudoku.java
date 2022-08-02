package com.company;

import java.util.HashSet;

/*Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.

 */
public class ValidSudoku {

    public int boxn (int i, int j){

        if (i < 3 ){
            if (j < 3) return 0;
            else if (j < 6) return  1;
            else return  2;
        }else if (i < 6){
            if (j < 3) return  3;
            else if (j < 6) return  4;
            else return  5;
        }else {
            if (j < 3) return  6;
            else if (j < 6) return  7;
            else return  8;
        }

    }
    public boolean isValidSudoku(char[][] board) {
        HashSet[] columns = new HashSet[9];
        HashSet[] rows = new HashSet[9];
        HashSet[] boxs = new HashSet[9];
        for (int i = 0; i < 9 ; i++){
            columns[i] = new HashSet();
            rows[i] = new HashSet();
            boxs[i] = new HashSet();
        }

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){

                if (board[i][j] != '.'){

                    if (!columns[i].contains(board[i][j]) && !rows[j].contains(board[i][j]) && !boxs[boxn(i,j)].contains(board[i][j])){
                        columns[i].add(board[i][j]);
                        rows[j].add(board[i][j]);
                        boxs[boxn(i,j)].add(board[i][j]);
                    } else return false;
                }
            }
        }

        return true;
    }
}
