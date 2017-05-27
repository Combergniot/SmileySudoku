package model;

/**
 * Created by User on 27.05.2017.
 */
public class PointAndClick {

    int img = 2;
private int[][] tabela = {{0,0,0,0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0,0,0,0}
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
        if (isFieldEmpty(x, y)) {
            tabela[x][y] = img;


            return true;
        }

        return false;
    }

}

