package model;

import java.util.Random;

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
           tabela[x][y] = (tabela [x][y] +1 )% 5;


            return true;
        }




}

