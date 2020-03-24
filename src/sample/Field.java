package sample;

public class Field {

    private Tile[][] arr;

    public Field() {initField();}
    public Tile[][] getArr() {return arr;}
    public void initField() {
        arr = new Tile[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = new Tile();
            }
        }
    }
    public void changeNumbers(int code) {
        int x = code%arr.length, y = code/arr.length;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if ((x+i >= 0 && x+i < arr.length) && (y+j >= 0 && y+j < arr.length) && !(i == 0 && j == 0) &&
                        Math.abs(i * j) == 0 && arr[x][y].getValue() > 0 && arr[x+i][y+j].getValue() < 10) {
                    arr[x+i][y+j].setValue(arr[x][y].getValue() + 1);
                    arr[x][y].setValue(arr[x][y].getValue() - 1);
                }
            }
        }
    }
}