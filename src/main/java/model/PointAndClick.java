package model;

/**
 * Created by User on 27.05.2017.
 */
public class PointAndClick {


private int[][] tabela = {{0,0,0,0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0,0,0,0}};

    private boolean isFieldEmpty(int x, int y) {
        return tabela[x][y] == 0;
    }


    public int getField(int x, int y) {
        return tabela[x][y];}

    public boolean setField(int x, int y) {
           tabela[x][y] = (tabela [x][y] +1 )% 9;


            return true;
        }


    private int [][] sudokuBoard = {{5, 3, 4, 6, 7, 8, 0, 1, 2},
                                    {6, 7, 2, 1, 0, 5, 3, 4, 8},
                                    {1, 0, 8, 3, 4, 2, 5, 6, 7},
                                    {8, 5, 0, 7, 6, 1, 4, 2, 3},
                                    {4, 2, 6, 8, 5, 3, 7, 0, 1},
                                    {7, 1, 3, 0, 2, 4, 8, 5, 6},
                                    {0, 6, 1, 5, 3, 7, 2, 8, 4},
                                    {2, 8, 7, 4, 1, 0, 6, 3, 5},
                                    {3, 4, 5, 2, 8, 6, 1, 7, 0}};

    public boolean setSudokuBoard(int x, int y) {
        sudokuBoard[x][y] = (sudokuBoard [x][y] +1 )% 9;


        return true;
    }

    public int getSudokuBoard(int x, int y) {
        return sudokuBoard [x][y];}

    private boolean[][] filter =
                   {{false, false, false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false, false, false}};



}

